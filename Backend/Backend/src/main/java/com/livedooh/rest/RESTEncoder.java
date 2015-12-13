package com.livedooh.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;
import com.livedooh.encoder.*;

@Path("/encoder")
public class RESTEncoder {

	private Encoder en;

	public RESTEncoder() {
		en = new Encoder();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String encodeString(JSONObject json) {
		return en.encode(json.getString("encode"));
	}

}
