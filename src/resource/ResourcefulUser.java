package resource;

import pool.ResourcePool;
import action.TakeResourceAction;

public class ResourcefulUser<R extends Resource> {
	protected R resource;
	
	public ResourcefulUser() {
	}
	
	public R getResource() {
		return resource;
	}
	
	public void takeResource(ResourcePool<R> ressources){
		TakeResourceAction<R> tra = new TakeResourceAction<R>(this, ressources); 
	}
	public void resetResource() {
		this.resource = null;
	}
	
	public void setResource(R r) {
		this.resource = r;
	}

}
