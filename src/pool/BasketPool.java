package pool;

import resource.Basket;

/**
 * class wich represents a pool of baskets
 * 
 * @author dimitri remy
 * 
 */
public class BasketPool extends ResourcePool<Basket> {

	/**
	 * Builder from this class
	 * 
	 * @param nbResource
	 *            number of baskets from the BasketPool
	 */
	public BasketPool(int nbResource) {
		super(nbResource);
	}
	/**
	 * @param number of resources
	 */
	@Override
	protected void createPool(int nbResource) {
		for (int i = 0; i < nbResource; i++) {
			this.freeResources.add(new Basket());
		}

	}
	/**
	 * get the resource name
	 */
	@Override
	public String getResourceName() {
		return "Basket";
	}

}
