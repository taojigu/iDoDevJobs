package com.idodevjobs.sample.service;

import com.idodevjobs.sample.mode.ExampleModel;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/example")
@Produces("application/json")
public interface ExampleService {
 
    @GET
    @Path("/{id}")
    public ExampleModel get(@PathParam("id") String id);
    
    @POST
    @Path("/post/{id}")
    public ExampleModel post(@BeanParam ExampleModel model);
    
}