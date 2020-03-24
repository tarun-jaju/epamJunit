package junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.BeforeEach;

public class TestRemoveFirst2A {
	RemoveFirst2A r;
	       /*“ABCD” => “BCD”-sucess
			 “AACD” => “CD”-sucess
			 “BACD” => “BCD”-sucess
			 “BBAA” => “BBAA”-sucess
			 “AABAA” => “BAA” -sucess*/
	@BeforeEach
	void createObject()
	{
		r=new RemoveFirst2A();
	}
	@Test
	void remove1A()
	{
		assertEquals("BCD",r.deleteA("ABCD"));
	}

	@Test
	void remove2A()
	{
		assertEquals("CD",r.deleteA("AACD"));
	}
	@Test
	void remove2PosA()
	{
		assertEquals("BCD",r.deleteA("BACD"));
	}
	@Test
	void NoRemoveA()
	{
		assertEquals("BAA",r.deleteA("AABAA"));
	}
	@Test
	void remove()
	{
		assertEquals("AABAA",r.deleteA("BAA"));
	}
}
