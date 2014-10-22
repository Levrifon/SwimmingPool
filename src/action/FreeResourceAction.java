package action;

import pool.ResourcePool;
import resource.Resource;
import resource.ResourcefulUser;

/**
 * class for free the resource of this user
 * 
 * @author dimitri remy
 * 
 * @param <T>
 *            resource use by the action
 */
public class FreeResourceAction<T extends Resource> extends Action {
	private boolean fini;
	private ResourcefulUser<T> user;
	private ResourcePool<T> pool;

	public FreeResourceAction(ResourcefulUser<T> user, ResourcePool<T> pool) {
		super();
		fini = false;
		this.user = user;
		this.pool = pool;
	}

	@Override
	public boolean isFinished() {
		return fini;
	}

	@Override
	protected void doRealStep() {
		if (user.getResource() != null) {
			pool.freeResource(user.getResource());
			user.setResource(null);
			System.out.println(user.getNameUser()+ " libère un(e) "+ pool.getResourceName());
			fini = true;
		}
	}

}
