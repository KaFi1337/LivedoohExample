package com.livedooh.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.livedooh.decoder.*;

public class DecoderTest {
	
	Decoder decoder = new Decoder();

	@Test
	public void decodeTest() {
		assertTrue("hello".equals(decoder.decode("aGVsbG8=")));
	}
	
}
