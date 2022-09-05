package org.hccp.jvm.autotune;

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.stream.Collectors;

public class Utils {


    public static final String ORG_HCCP_JVM_AUTOTUNE_FUNCTIONS = "org.hccp.jvm.autotune.functions";

    public static Point2D getMaxY(Class clazz) throws NoSuchFieldException, IllegalAccessException {
        Point2D[] pointsClone = getYSortedPoints(clazz);
        return pointsClone[pointsClone.length - 1];
    }


    public static Point2D getMaxX(Class clazz) throws NoSuchFieldException, IllegalAccessException {
        Point2D[] pointsClone = getXSortedPoints(clazz);
        return pointsClone[pointsClone.length - 1];
    }

    public static Point2D getMinY(Class clazz) throws NoSuchFieldException, IllegalAccessException {
        Point2D[] pointsClone = getYSortedPoints(clazz);
        return pointsClone[0];
    }


    public static Point2D getMinX(Class clazz) throws NoSuchFieldException, IllegalAccessException {
        Point2D[] pointsClone = getXSortedPoints(clazz);
        return pointsClone[0];
    }

    public static Point2D[] getYSortedPoints(Class clazz) throws NoSuchFieldException, IllegalAccessException {
        return getSortedPoints(clazz, new YComparator());
    }

    public static Point2D[] getXSortedPoints(Class clazz) throws NoSuchFieldException, IllegalAccessException {
        return getSortedPoints(clazz, new XComparator());
    }


    public static Point2D[] getSortedPoints(Class clazz, Comparator comparator) throws NoSuchFieldException, IllegalAccessException {
        Field field = clazz.getField("points");
        Point2D[] points = (Point2D[]) field.get(null);
        Point2D[] pointsClone = points.clone();
        Arrays.sort(pointsClone, comparator);
        return pointsClone;
    }

    public static Double getParameterValue(String name) {
         Properties props = System.getProperties();
        return Double.parseDouble(props.getProperty(name));
    }



    public static List<String> getClassNames() throws IOException, URISyntaxException {
        List<String> functionNames = new ArrayList<String>();



        Enumeration<URL> urls = ClassLoader.getSystemClassLoader()
                .getResources(ORG_HCCP_JVM_AUTOTUNE_FUNCTIONS.replace(".", "/"));

        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();

            URI uri = url.toURI();
            FileSystem zipFs = FileSystems.newFileSystem(uri, Collections.emptyMap());

            Path root = zipFs.getPath(ORG_HCCP_JVM_AUTOTUNE_FUNCTIONS.replace(".", "/"));

            Files.walkFileTree(root, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
                    String pathString = path.toString();
                    if (pathString.endsWith(".class")) {
                        functionNames.add(pathString.substring(0, pathString.indexOf('.')).replace('/', '.'));
                    }
                    return FileVisitResult.CONTINUE;
                }
            });


        }





        return functionNames;
    }

}
