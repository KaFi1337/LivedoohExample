package com.livedooh.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@PATH("/encoder")
public class RESTEncoder {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String encodeString(JSONObject json) {
		
	}

}
