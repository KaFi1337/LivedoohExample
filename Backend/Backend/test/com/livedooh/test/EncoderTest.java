package com.livedooh.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.livedooh.encoder.*;

public class EncoderTest {

	
	Encoder encoder = new Encoder();

	@Test
	public void encodeTest() {
		assertTrue("aGVsbG8=".equals(encoder.encode("hello")));
	}
	
}
