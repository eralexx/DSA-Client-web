package DSA.Project;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/Users")
public class RESTManager {

    Implementation Manager = Implementation.getInstance();

    @GET
    @Path("/Test")
    @Produces(MediaType.APPLICATION_JSON)
    public String Test() {
        try {

            return "Hello World";
        }
        catch(Exception ex){
            return null;
        }
    }
    @GET
    @Path("/Login/{Email}/{Password}")
    @Produces(MediaType.APPLICATION_JSON)
    public String Login(@PathParam("Email") String Email, @PathParam("Password") String Password) {
        try {

            return "Ok";
        }
        catch(Exception ex){
            return null;
        }
    }
    @GET
    @Path("/Login/{Email}/{Username}/{Password}")
    @Produces(MediaType.APPLICATION_JSON)
    public String Login(@PathParam("Email") String Email,@PathParam("Username") String Username, @PathParam("Password") String Password) {
        try {

            return "Ok";
        }
        catch(Exception ex){
            return null;
        }
    }
}