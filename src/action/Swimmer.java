package action;

import pool.BasketPool;
import pool.CubiclePool;
import resource.Basket;
import resource.Cubicle;
import resource.ResourcefulUser;

/**
 * 
 * @author debue,charneux
 * 
 */

public class Swimmer extends SequentialScheduler {

	private String name;
	private BasketPool basket;
	private CubiclePool cubicle;
	private ResourcefulUser<Basket> user_basket;
	private ResourcefulUser<Cubicle> user_cubicle;
	private int unwearTime, swimmingTime, wearTime;

	public Swimmer(String name, BasketPool baskets, CubiclePool cubicles,
			int i, int j, int k) {
		super();
		this.setName(name);
		this.basket = baskets;
		this.cubicle = cubicles;
		this.unwearTime = i;
		this.swimmingTime = j;
		this.wearTime = k;
		user_basket = new ResourcefulUser<Basket>();
		user_cubicle = new ResourcefulUser<Cubicle>();
		initAction();
	}

	public void initAction(){
		actions.add(new TakeResourceAction<Basket>(user_basket, basket));
		actions.add( new Message(name + " a pris un panier."));
		actions.add(new TakeResourceAction<Cubicle>(user_cubicle, cubicle));
		actions.add( new Message(name + " est entré dans une cabine."));
		actions.add(new Unwear(unwearTime, this));
		actions.add(new FreeResourceAction<Cubicle>(user_cubicle, cubicle));
		actions.add( new Message(name + " libère la cabine."));
		actions.add(new Swim(swimmingTime, this));
		actions.add(new TakeResourceAction<Cubicle>(user_cubicle, cubicle));
		actions.add( new Message(name + " prend une cabine."));
		actions.add(new Wear(wearTime, this));
		actions.add(new FreeResourceAction<Cubicle>(user_cubicle, cubicle));
		actions.add( new Message(name + " libère la cabine."));
		actions.add(new FreeResourceAction<Basket>(user_basket, basket));
		actions.add( new Message(name + " a rendu son panier."));
	}
	
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
