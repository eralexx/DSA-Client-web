package DSA.Project;


import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.http.server.StaticHttpHandler;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class App
{
    // Base URI the Grizzly HTTP server will listen on
    public static final String BASE_URI = "http://localhost:8085/rest/";


    public static HttpServer startServer() {
        final ResourceConfig rc = new ResourceConfig().packages("DSA.Project");

        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }
    public static void main(String[] args) throws IOException {
        final HttpServer server = startServer();

        StaticHttpHandler staticHttpHandler = new StaticHttpHandler("./public/");
        server.getServerConfiguration().addHttpHandler(staticHttpHandler, "/");


        System.out.println(String.format("Jersey app started with WADL available at "
                + "%sapplication.wadl\nHit enter to stop it...", BASE_URI));

        System.in.read();
        server.stop();
    }

}
