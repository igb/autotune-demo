package org.hccp.jvm.autotune;


import java.awt.geom.Point2D;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class ExperimentGenerator {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, IOException, URISyntaxException {

        StringBuffer sb = new StringBuffer();


        List<String> classNames = Utils.getClassNames();
        for (int i = 0; i < classNames.size(); i++) {

            String name = classNames.get(i);
            Class clazz =  Class.forName(name);
            Point2D max = Utils.getMaxX(clazz);
            Point2D min = Utils.getMinX(clazz);

            sb.append("{\n");
            sb.append("\t\"name\": \"");
            sb.append(name);
            sb.append("\",\n");
            sb.append("\t\"type\": \"range\",\n");
            sb.append("\t\"bounds\": [");
            sb.append(min.getX());
            sb.append(", ");
            sb.append(max.getX());
            sb.append("],\n");
            sb.append("\t\"value_type\": ");
            sb.append("\"float\",\n");
            sb.append("\t\"log_scale\": False,\n");
            sb.append("}\n");





        }
        System.out.println(sb.toString());

    }



}
