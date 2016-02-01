package com.idodevjobs.sample.exception.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;

public class ThrowableMapper implements ExceptionMapper<Throwable> {
	
	@Override
	public Response toResponse(Throwable ex){
		ResponseBuilder status = Response.status(Response.Status.INTERNAL_SERVER_ERROR);
		ResponseBuilder header = status.header("ContentType", "application/json");
		ResponseBuilder entity = header.entity(new String("Data Error"));
		return entity.build();
	}

}
