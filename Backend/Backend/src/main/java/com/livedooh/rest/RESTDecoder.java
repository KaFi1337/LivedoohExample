package com.livedooh.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

@Path("/decoder")
public class RESTDecoder {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String decodeString(JSONObject json) {
		return null;
		
	}
	
}