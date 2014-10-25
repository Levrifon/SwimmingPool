package pool;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import resource.Resource;

/**
 * class to representing a pool of a particulary resource.
 * 
 * @author Dimitri Rémy
 * 
 * @param <T>
 *            resource for the resourcePool
 */
public abstract class ResourcePool<T extends Resource> {
	protected List<T> freeResources;
	protected Set<T> busyResources;

	/**
	 * Buiulder for this class
	 * 
	 * @param nbResource
	 *            Number of resource usable from the resourcePool
	 */
	public ResourcePool(int nbResource) {
		freeResources = new ArrayList<T>();
		busyResources = new HashSet<T>();
		this.createPool(nbResource);
	}

	/**
	 * Create a pool of the size of nbResource
	 * 
	 * @param nbResource
	 *            number of elements in the pool
	 */
	protected abstract void createPool(int nbResource);

	/**
	 * Method to provide one resource of the ResourcePool
	 * 
	 * @return the resource remote
	 */
	public T provideResource() {
		if (!freeResources.isEmpty()) {
			T action = freeResources.remove(0);
			busyResources.add(action);
			return action;
		} else {
			throw new NoSuchElementException();
		}

	}

	/**
	 * Method to free one resource
	 * 
	 * @param resource
	 *            the resource freedom
	 */
	public void freeResource(T resource) {
		if (!busyResources.remove(resource)) {
			throw new IllegalArgumentException();
		} else {
			freeResources.add(resource);
		}
	}

	/**
	 * Method from return the name of resource from the ResourcePool
	 * 
	 * @return
	 */
	public abstract String getResourceName();

	/**
	 * method returning a list of free resource
	 * 
	 * @return the free resource
	 */
	public List<T> getFreeResources() {
		return this.freeResources;
	}

	/**
	 * method returning a list of busy resource
	 * 
	 * @return the busy resource
	 */
	public Set<T> getBusyResources() {
		return this.busyResources;
	}
}
