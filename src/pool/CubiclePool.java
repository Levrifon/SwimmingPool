package pool;

import resource.Cubicle;

/**
 * class representing a pool of cubicle
 * 
 * @author dimitri remy
 * 
 */
public class CubiclePool extends ResourcePool<Cubicle> {

	/**
	 * builder from this class
	 * 
	 * @param nb
	 *            number of maximal cubicle in the Pool
	 */
	public CubiclePool(int nb) {
		super(nb);
	}

	@Override
	protected void createPool(int nbResource) {
		for (int i = 0; i < nbResource; i++) {
			this.freeResources.add(new Cubicle());
		}
	}

	@Override
	public String getResourceName() {
		return "Cabine";
	}
}
