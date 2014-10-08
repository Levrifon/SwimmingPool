package pool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import resource.Resource;



public abstract class ResourcePool<T extends Resource>  {
	List<T> freeResources;
	Set<T> busyResources;
	
	public ResourcePool(int nbResource) {
		freeResources = new ArrayList<T>();
		busyResources = new HashSet<T>();
		this.createPool(nbResource);
	}

	protected abstract void createPool(int nbResource);
	
	public T provideResource() {
		if(!freeResources.isEmpty()) {
			T action = freeResources.remove(0);
			busyResources.add(action);
			
			return action;
		} else {
			throw new NoSuchElementException();
		}
		
	}
	
	public void freeResource(T resource) {
		if(!busyResources.remove(resource)) {
			throw new IllegalArgumentException();
		} else {
			freeResources.add(resource);
		}
	}
}