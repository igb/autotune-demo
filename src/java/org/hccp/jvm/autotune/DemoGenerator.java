package org.hccp.jvm.autotune;

import jdk.jshell.execution.Util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.Random;

public class DemoGenerator {
    public static void main(String[] args) throws IOException, URISyntaxException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Random random = new Random();

        StringBuffer sb = new StringBuffer();
        sb.append("java ");

        String jarpath = Utils.getJarFilePath();
        if (jarpath !=null) {
            sb.append("-cp ");
            sb.append(jarpath);
            sb.append(" ");
        }





        List<String> classNames = Utils.getClassNames();

        for (int i = 0; i < classNames.size(); i++) {

            String className = classNames.get(i);
            sb.append("-D");
            sb.append(className);
            sb.append("=");

            Class<?> clazz = Class.forName(className);

            double max = Utils.getMaxX(clazz).getX();
            double min = Utils.getMinX(clazz).getX();

            double value = min + random.nextFloat() * (max - min);

            sb.append(value);
            sb.append(" ");



        }

        sb.append("org.hccp.jvm.autotune.Demo 9000 9090");

        System.out.println(sb.toString());

    }
}
