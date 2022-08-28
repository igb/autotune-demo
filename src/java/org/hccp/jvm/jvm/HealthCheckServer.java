package org.hccp.jvm.jvm;

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
