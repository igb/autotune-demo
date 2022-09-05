package org.hccp.jvm.autotune;


import org.hccp.jvm.HealthCheckServer;
import org.hccp.jvm.StatsServer;

import java.awt.geom.Point2D;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Demo {



    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, IOException, URISyntaxException {
        double value = 0.0;
        double maxValue = 0.0;

        int functions = 0;
        int statsPort = Integer.parseInt(args[0]);
        int healthPort = Integer.parseInt(args[1]);


        List<String> functionNames = Utils.getClassNames();


        for (int i = 0; i < functionNames.size(); i++) {
            String name = functionNames.get(i);


                Class clazz = Class.forName(name);

                Point2D max = Utils.getMaxY(clazz);

                double maxX = max.getX();
                double maxY = max.getY();


                System.out.println(clazz.getSimpleName() + " X: " + maxX + " Y: " + maxY );

                maxValue += maxY;


                Function f = (Function) clazz.newInstance();
                Double x = Utils.getParameterValue(name);

                value  += f.getYforX(x);
                functions++;
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