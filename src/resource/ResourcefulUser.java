package resource;

import pool.ResourcePool;
import resource.Resource;
import action.TakeResourceAction;

public class ResourcefulUser<R extends Resource>{
	protected R resource;
	
	public ResourcefulUser() {
	}
	
	public R getResource() {
		return resource;
	}
	
	public void resetResource() {
		this.resource = null;
	}
	
	public void setResource(R r) {
		this.resource = r;
	}

}
