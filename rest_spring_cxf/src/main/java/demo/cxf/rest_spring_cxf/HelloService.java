package demo.cxf.rest_spring_cxf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/HelloService")
public interface HelloService {

    @GET
    @Path("/say")
    String say(@QueryParam("name") String name);
}
