package action;

import pool.BasketPool;
import pool.CubiclePool;
import resource.Basket;
import resource.Cubicle;
import resource.ResourcefulUser;

/**
 * 
 * @author Dimitri Charneux, Rémy Debue
 * 
 */

public class Swimmer extends SequentialScheduler {

	private String name;
	private BasketPool basket;
	private CubiclePool cubicle;
	private ResourcefulUser<Basket> user_basket;
	private ResourcefulUser<Cubicle> user_cubicle;
	private int unwearTime, swimmingTime, wearTime;
	/**
	 * Constructor of the Swimmer with his name, the basketpool, the cubiclepool and the duration of unwear,swim,wear
	 * @param name
	 * @param baskets
	 * @param cubicles
	 * @param i
	 * @param j
	 * @param k
	 */
	public Swimmer(String name, BasketPool baskets, CubiclePool cubicles,
			int i, int j, int k) {
		super();
		this.setName(name);
		this.basket = baskets;
		this.cubicle = cubicles;
		this.unwearTime = i;
		this.swimmingTime = j;
		this.wearTime = k;
		user_basket = new ResourcefulUser<Basket>(this.getName());
		user_cubicle = new ResourcefulUser<Cubicle>(this.getName());
		initAction();
	}
	/**
	 * Initialize all his proper action
	 */
	public void initAction(){
		actions.add(new TakeResourceAction<Basket>(user_basket, basket));
		actions.add(new TakeResourceAction<Cubicle>(user_cubicle, cubicle));
		actions.add(new Unwear(unwearTime, this));
		actions.add(new FreeResourceAction<Cubicle>(user_cubicle, cubicle));
		actions.add(new Swim(swimmingTime, this));
		actions.add(new TakeResourceAction<Cubicle>(user_cubicle, cubicle));
		actions.add(new Wear(wearTime, this));
		actions.add(new FreeResourceAction<Cubicle>(user_cubicle, cubicle));
		actions.add(new FreeResourceAction<Basket>(user_basket, basket));
	}
	/**
	 * 
	 * @return name of the swimmer
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CubiclePool getCubicle() {
		return cubicle;
	}

	public int getUnwearTime() {
		return unwearTime;
	}

	public void setUnwearTime(int unwearTime) {
		this.unwearTime = unwearTime;
	}

	public int getSwimmingTime() {
		return swimmingTime;
	}

	public void setSwimmingTime(int swimmingTime) {
		this.swimmingTime = swimmingTime;
	}

	public int getWearTime() {
		return wearTime;
	}

	public void setWearTime(int wearTime) {
		this.wearTime = wearTime;
	}

	public BasketPool getBasket() {
		return basket;
	}

	@Override
	public String toString() {
		return "Swimmer Je s'appelle " + name;
	}

}
