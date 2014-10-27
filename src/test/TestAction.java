package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import pool.BasketPool;
import pool.CubiclePool;
import action.ForeseeableAction;
import action.Swimmer;
import exception.ActionFinishedException;

public class TestAction {
	ForeseeableAction fa;
	Swimmer sw;
	int wearingTime,unwearingTime,swimmingTime;
	BasketPool bp;
	CubiclePool cp;
	@Before
	public void init() {
		wearingTime=7;
		unwearingTime=5;
		swimmingTime=2;
		fa = new ForeseeableAction(3);
		bp = new BasketPool(5);
		cp = new CubiclePool(3);
		sw = new Swimmer("Toto", bp, cp, unwearingTime, swimmingTime, wearingTime);
	}
	
	@Test
	public void testSwimmer() {
		assertEquals(5,sw.getUnwearTime());
		assertEquals(2,sw.getSwimmingTime());
		assertEquals(7,sw.getWearTime());
	}
	
	@Test
	public void testSwimmerToString() {
		assertEquals("Swimmer Je s'appelle Toto",sw.toString());
	}
	@Test
	public void testSwimmerGetBasketOrCubicle() {
		assertEquals(bp,sw.getBasket());
		assertEquals(cp,sw.getCubicle());
	}
	@Test
	public void testStepsFAction() {
		assertFalse(fa.isFinished());
		assertTrue(fa.isReady());
		try {
			fa.doStep();
		} catch (ActionFinishedException e) {
			e.printStackTrace();
		}
		assertFalse(fa.isReady());
		assertTrue(fa.isInProgress());
		try {
			fa.doStep();
			fa.doStep();
		} catch (ActionFinishedException e) {
			e.printStackTrace();
		}
		assertTrue(fa.isFinished());
		assertFalse(fa.isInProgress());
		assertFalse(fa.isReady());

	}

}
