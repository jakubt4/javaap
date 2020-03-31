package example;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class App {

    public static final String BASE_URI = "http://0.0.0.0:8081/javaapp/";

    public static HttpServer startSever() {
        final ResourceConfig resourceConfig = new ResourceConfig().packages("example");
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), resourceConfig);
    }

    public static void main(final String[] args) throws IOException {
        final HttpServer startSever = startSever();
        System.in.read();
        startSever.shutdown();
    }
}
