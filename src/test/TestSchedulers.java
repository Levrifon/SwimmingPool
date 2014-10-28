package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exception.ActionFinishedException;

import pool.BasketPool;
import pool.CubiclePool;
import action.FairScheduler;
import action.Swimmer;

public class TestSchedulers {
	FairScheduler fs;
	BasketPool baskets;
	CubiclePool cubicles;

	@Before
	public void init() {
		baskets = new BasketPool(6);
		cubicles = new CubiclePool(3);
		fs = new FairScheduler();
		fs.addAction(new Swimmer("Camille", baskets, cubicles, 6, 4, 8));
		fs.addAction(new Swimmer("Loïs", baskets, cubicles, 2, 10, 4));
		fs.addAction(new Swimmer("Maé", baskets, cubicles, 10, 18, 10));
		fs.addAction(new Swimmer("Ange", baskets, cubicles, 3, 7, 5));
		fs.addAction(new Swimmer("Louison", baskets, cubicles, 18, 3, 3));
		fs.addAction(new Swimmer("Charlie", baskets, cubicles, 3, 6, 10));
		fs.addAction(new Swimmer("Alexis", baskets, cubicles, 6, 5, 7));
	}

	@Test
	public void testNextAction() {
		assertTrue(fs.isReady());
		assertFalse(fs.isFinished());
		assertFalse(fs.isInProgress());
		try {
			fs.doStep();
		} catch (ActionFinishedException e) {
			e.printStackTrace();
		}
	}
}
