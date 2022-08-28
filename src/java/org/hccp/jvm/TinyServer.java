package org.hccp.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class TinyServer implements Runnable{

    private  int port;

    public TinyServer(int port) {
        this.port=port;
    }



    public void run()  {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept();

                String content = getContent();

                InputStream is = socket.getInputStream();
                byte[] buffer = new byte[256];
                is.read(buffer);
                OutputStream os = socket.getOutputStream();
                os.write(("HTTP/1.1 200 OK\n" +
                        "Content-Type: "+ getMimeType() +"\n" +
                        "Content-Length: " + content.length() + "\n\n" + content).getBytes());
                os.flush();
                os.close();
                socket.close();
                System.out.println("request recieved! sent content: " + content);
            }

        }catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
    }

    public abstract String getMimeType();

    public abstract String getContent();


}
