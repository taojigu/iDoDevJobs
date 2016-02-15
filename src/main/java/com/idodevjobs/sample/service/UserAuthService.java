package com.idodevjobs.sample.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.idodevjobs.sample.mode.CustomResponse;

@Path("/userAuth")
@Produces("application/json")
public interface UserAuthService {
	
	@Path("/userList")
	@GET
	public CustomResponse getUserList();

}
