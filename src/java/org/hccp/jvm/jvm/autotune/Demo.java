package org.hccp.jvm.jvm.autotune;


import org.hccp.jvm.jvm.HealthCheckServer;
import org.hccp.jvm.jvm.StatsServer;

import java.awt.geom.Point2D;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;

public class Demo {



    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        double value = 0.0;
        double maxValue = 0.0;

        int functions = 0;
        int statsPort = Integer.parseInt(args[0]);
        int healthPort = Integer.parseInt(args[1]);


        Properties props = System.getProperties();
        Enumeration propertyNames = props.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String name = (String) propertyNames.nextElement();
            if (name.startsWith("org.hccp.jvm.jvm.autotune.functions")) {
                Class clazz = Class.forName(name);

                Field field = clazz.getField("points");
                Class<?> t = field.getType();
                Point2D[] points = (Point2D[]) field.get(null);
                Point2D[] pointsClone = points.clone();
                Arrays.sort(pointsClone, new YComparator());
                double maxX = pointsClone[pointsClone.length - 1].getX();
                double maxY = pointsClone[pointsClone.length - 1].getY();


                System.out.println(clazz.getSimpleName() + " X: " + maxX + " Y: " + maxY );
                maxValue += maxY;


                Function f = (Function) clazz.newInstance();
                Double x = Double.parseDouble(props.getProperty(name));

                value  += f.getYforX(x);
                functions++;
            }
        }






        value = value / functions;
        maxValue  = maxValue  / functions;

        System.out.println("value = " + value);
        System.out.println("max value = " + maxValue);
        System.out.println("max obj score = " + (maxValue / value));

        System.out.println("functions = " + functions);
        StatsServer statsServer = new StatsServer(statsPort, value);

        Thread sst = new Thread(statsServer);
        sst.start();

        HealthCheckServer healthCheckServer = new HealthCheckServer(healthPort);

        Thread hcst = new Thread(healthCheckServer);
        hcst.start();





    }




}