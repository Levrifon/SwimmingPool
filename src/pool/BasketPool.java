package pool;

import resource.Basket;

/**
 * class from representing a pool of baskets
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

	@Override
	protected void createPool(int nbResource) {
		for (int i = 0; i < nbResource; i++) {
			this.freeResources.add(new Basket());
		}

	}

	@Override
	public String getResourceName() {
		return "Basket";
	}

}
