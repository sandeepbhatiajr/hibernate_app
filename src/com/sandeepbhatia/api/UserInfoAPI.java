package com.sandeepbhatia.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("api/userinfo/")
public class UserInfoAPI {

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("add/")
	public void addUser() {
		System.out.println("rest call");
	}
}
