package pool;

import resource.Basket;

public class BasketPool extends ResourcePool<Basket>{

	public BasketPool(int nbResource) {
		super(nbResource);
	}

	@Override
	protected void createPool(int nbResource) {
		for(int i = 0 ; i <nbResource; i++) {
			this.freeResources.add(new Basket());
		}
		
	}

}
