package com.idodevjobs.sample.exception.mapper;

import javax.ws.rs.ext.ExceptionMapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ServerErrorException;


public class ServerExceptionMapper implements ExceptionMapper<ServerErrorException> {

	@Override
	public Response toResponse(ServerErrorException ex)
	{
		ResponseBuilder rb = Response.status(Response.Status.INTERNAL_SERVER_ERROR).header("ContentType", "application/json");
		 String entityStr = new String("INTERNAL SERVER ERROR");
		ResponseBuilder entity = rb.entity(entityStr);
		return entity.build();
	}
}
 