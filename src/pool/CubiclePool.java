package pool;

import resource.Cubicle;

public class CubiclePool extends ResourcePool<Cubicle>{
	public CubiclePool(int nb){
		super(nb);
	}

	@Override
	protected void createPool(int nbResource) {
		for(int i = 0 ; i <nbResource; i++) {
			this.freeResources.add(new Cubicle());
		}
	}
	

	@Override
	public String getResourceName() {
		return "Cabine";
	}
}
