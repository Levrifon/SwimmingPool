package pool;

import resource.Cubicle;

public class CubiclePool extends ResourcePool<Cubicle>{
	public CubiclePool(int nb){
		super(nb);
	}

	@Override
	protected void createPool(int nbResource) {
		
	}
}
