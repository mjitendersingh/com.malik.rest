package com.malik.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class V1_status {

	private static final String api_version = "00.01.00";
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String retunTitle(){
		return "Java Web Service";
	}
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String retunVersion(){
		return "<p>Version: </p>" + api_version;
	}
	
}
