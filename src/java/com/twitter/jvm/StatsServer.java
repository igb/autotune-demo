package com.twitter.jvm;

import java.io.*;

public class StatsServer extends TinyServer {

    private  String summaryResultsFile;

    public StatsServer(int port, String summaryResultsFile) {
        super(port);
        this.summaryResultsFile=summaryResultsFile;
    }

    public static void main(String[] args) throws IOException {

        StatsServer statsServer = new StatsServer(Integer.parseInt(args[0]),  args[1]);


        statsServer.run();
        return;


    }


    @Override
    public String getMimeType() {
        return "application/json";
    }

    @Override
    public String getContent() {
        return getStats(summaryResultsFile);
    }

    private static String getStats(String summaryResultsFile)  {
        StringBuffer sb = new StringBuffer();
        sb.append("{\n");

       try {
           InputStream is = new FileInputStream(summaryResultsFile);
           BufferedReader buf = new BufferedReader(new InputStreamReader(is));
           String line = buf.readLine();
           while (line != null) {
               if (line.contains("Result")) {
                   String result = line.split("\\:")[2].split(" ")[1];
                   sb.append(" \"specjvm/result/composite\" : ");
                   sb.append(result);
                   sb.append("\n");
               }
               line = buf.readLine();
           }

       } catch (IOException ioe) {
           sb.append("error: ");
           sb.append(ioe.getMessage());
           ioe.printStackTrace();
       }

        sb.append("}");
         return sb.toString();

    }
}
