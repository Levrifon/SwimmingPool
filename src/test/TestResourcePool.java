package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import pool.BasketPool;
import pool.CubiclePool;
import resource.Basket;

public class TestResourcePool {
	BasketPool bp;
	CubiclePool cp;
	@Before
	public void init() {
		bp = new BasketPool(5);
		cp = new CubiclePool(3);
	}
	
	@Test
	public void testGetName() {
		assertEquals("Basket",bp.getResourceName());
		assertEquals("Cabine",cp.getResourceName());
	}
	@Test
	public void testGetRessource() {
		assertTrue(bp.getBusyResources().isEmpty());
		assertTrue(cp.getBusyResources().isEmpty());
		assertFalse(bp.getFreeResources().isEmpty());
		assertFalse(cp.getFreeResources().isEmpty());
	}
	@Test
	public void testProvideResource() {
		Basket b = bp.provideResource();
		assertEquals(b,bp.getBusyResources().iterator().next());
		assertFalse(bp.getBusyResources().isEmpty());
		bp.freeResource(b);
		assertTrue(bp.getBusyResources().isEmpty());
	}

}
