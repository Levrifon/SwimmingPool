package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import exception.ActionFinishedException;

import action.ForeseeableAction;

public class TestAction {
	ForeseeableAction fa;
	@Before
	public void init() {
		fa = new ForeseeableAction(3);
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
	}

}
