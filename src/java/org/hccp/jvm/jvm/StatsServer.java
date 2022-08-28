package org.hccp.jvm.jvm;

import java.io.*;

public class StatsServer extends TinyServer {

    private  Double value;

    public StatsServer(int port, Double value) {
        super(port);
        this.value = value;
    }

    public static void main(String[] args) throws IOException {

        StatsServer statsServer = new StatsServer(Integer.parseInt(args[0]),  Double.parseDouble(args[1]));


        statsServer.run();
        return;


    }


    @Override
    public String getMimeType() {
        return "application/json";
    }

    @Override
    public String getContent() {

        StringBuffer sb = new StringBuffer();
        sb.append("{\n");


        sb.append(" \"autotune/perf/result\" : ");
        sb.append(value);
        sb.append("\n");

        sb.append("}");
        return sb.toString();

    }
}
