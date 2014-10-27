package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import resource.Basket;
import resource.Cubicle;
import resource.Resource;
import resource.ResourcefulUser;

public class TestResource {
	Basket b;
	Cubicle c;
	Resource r;
	ResourcefulUser<Basket> rfu_basket;
	ResourcefulUser<Cubicle> rfu_cubicle;
	@Before
	public void init() {
		b = new Basket();
		c = new Cubicle();
		rfu_basket = new ResourcefulUser<Basket>("Toto");
		rfu_cubicle = new ResourcefulUser<Cubicle>("Tata");
	}
	
	@Test
	public void testStringDescription() {
		assertEquals("Panier-",b.description());
		assertEquals("Cabine-",c.description());
	}
	
	@Test
	public void testGetResource() {
		assertEquals(null,rfu_basket.getResource());
		assertEquals(null,rfu_cubicle.getResource());
		rfu_basket.setResource(b);
		assertEquals(b,rfu_basket.getResource());
		rfu_cubicle.setResource(c);
		assertEquals(c,rfu_cubicle.getResource());
		
	}
	
	@Test
	public void testResourceNameUser() {
		assertEquals("Toto",rfu_basket.getNameUser());
		assertEquals("Tata",rfu_cubicle.getNameUser());
	}
	
	@Test
	public void testResetResource() {
		rfu_basket.setResource(b);
		rfu_cubicle.setResource(c);
		assertTrue(rfu_basket.getResource() != null && rfu_cubicle.getResource() != null);
		rfu_basket.resetResource();
		assertFalse(rfu_basket.getResource() != null);
		rfu_cubicle.resetResource();
		assertFalse(rfu_cubicle.getResource() != null);
		
	}

}
