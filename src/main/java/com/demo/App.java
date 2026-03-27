package com.demo;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) throws IOException {
		System.out.println("inside start of App class before");
        HttpServer server = HttpServer.create(new InetSocketAddress(3000), 0);
        server.createContext("/", exchange -> {
            String response = "Hello from Java CI/CD on AWS!";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        });
        server.start();
        System.out.println("Server started on port 3000");
    }
}

