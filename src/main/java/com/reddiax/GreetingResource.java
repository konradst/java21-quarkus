package com.reddiax;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Path("/world")
    @Produces(MediaType.APPLICATION_JSON)
    public Response world() {
        GreetingDto greeting = new GreetingDto("World!");
        return Response.ok(greeting).build();
    }
}
