package org.ubick;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

@Service
@Path("/")
public class MyServices{

    @GET
    @Path("/id")
    @Produces(MediaType.APPLICATION_JSON)
    public Info getService1(){
        Info info = new Info();
        info.setId("Id34");
        return info;
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Info getDataCurve(){
        Info info = new Info();
        info.setId("Id34");
        return info;
    }


}