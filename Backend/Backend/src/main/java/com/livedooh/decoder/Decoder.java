package com.livedooh.decoder;

import com.sun.jersey.core.util.Base64;

public class Decoder {

	public String decode(String base64) {
		byte[] decodedBytes = Base64.decode(base64);
		System.out.println(base64 + " " + new String(decodedBytes));
		return null;
	}

}
