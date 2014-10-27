package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pool.BasketPool;
import pool.CubiclePool;

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

}
