package com.idodevjobs.sample.exception.mapper;

import java.net.ConnectException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;

public class ConnectionExceptionMapper implements ExceptionMapper<ConnectException> {

	@Override
	public Response toResponse(ConnectException ex){
		ResponseBuilder status = Response.status(Response.Status.GATEWAY_TIMEOUT);
		ResponseBuilder header = status.header("ContentType", "application/json");
		ResponseBuilder entity = header.entity("ConnectFailed");
		return entity.build();
	}
}
