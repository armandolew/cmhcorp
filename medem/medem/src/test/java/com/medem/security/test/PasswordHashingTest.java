package com.medem.security.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/mvc-dispatcher-servlet.xml")
public class PasswordHashingTest {
	
	@Test
	public void testSpringEncoder() {
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
	    String hashedPass = encoder.encodePassword("koala", null);
	    System.out.println("a564de63c2d0da68cf47586ee05984d7"+ "-"+ hashedPass);
	    assertEquals("a564de63c2d0da68cf47586ee05984d7", hashedPass);
	}

}



