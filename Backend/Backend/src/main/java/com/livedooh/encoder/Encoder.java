package com.livedooh.encoder;

import com.sun.jersey.core.util.Base64;

public class Encoder {

	public String encode(String text) {
		byte[] encodedBytes = Base64.encode(text.getBytes());
		System.out.println(text + " " + new String(encodedBytes));
		return new String(encodedBytes);
	}
}
