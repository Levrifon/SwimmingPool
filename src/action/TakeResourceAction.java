package action;

import pool.ResourcePool;
import resource.Resource;
import resource.ResourcefulUser;

public class TakeResourceAction<T extends Resource> extends Action {
	private boolean fini;
	private ResourcefulUser<T> user;
	private ResourcePool<T> pool;
	
	public TakeResourceAction(ResourcefulUser<T> user, ResourcePool<T> pool) {
		super();
		this.user = user;
		this.pool = pool;
		fini = false;
	}
	
	@Override
	public boolean isFinished() {
		return fini;
	}

	@Override
	protected void doRealStep() {
		fini = true;
		 user.setResource(pool.provideResource());
		
	}

}
