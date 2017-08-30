package com.example.demo;

import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
@Service
public class RestTest {

    @GET
    public Response getTestNotSecureEndpoint(){
        return Response.ok(new JsonResponseTest("hello world")).build();
    }


    @GET
    @Path("/hello/{name}")
    public Response getTestNotSecureEndpoint(@PathParam("name") String name){
        return Response.ok(new JsonResponseTest("hello " + name)).build();
    }
}
