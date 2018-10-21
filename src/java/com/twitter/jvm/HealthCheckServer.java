package com.twitter.jvm;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HealthCheckServer extends TinyServer {


    public HealthCheckServer(int port) {
        super(port);
    }

    @Override
    public String getMimeType() {
        return "text/text";
    }

    @Override
    public String getContent() {
        return "OK";
    }
}
