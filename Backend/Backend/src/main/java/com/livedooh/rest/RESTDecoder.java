package com.livedooh.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;
import com.livedooh.decoder.*;

@Path("/decoder")
public class RESTDecoder {
	
	private Decoder dec;
	
	public RESTDecoder() {
		dec = new Decoder();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String decodeString(JSONObject json) {
		
		return dec.decode(json.getString(""));
		
	}
	
}
