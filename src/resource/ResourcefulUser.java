package resource;

/**
 * class which handle a resource used by a swimmer
 * 
 * @author dimitri remy
 * 
 * @param <R>
 *            type of resource used.
 */
public class ResourcefulUser<R extends Resource> {
	protected R resource;
	private String nameUser;

	/**
	 * builder for this class
	 * 
	 * @param nameUser
	 *            name of swimmer used a resource.
	 */
	public ResourcefulUser(String nameUser) {
		this.nameUser = nameUser;
	}

	/**
	 * Method from return the resource of the {@link ResourcefulUser}.
	 * 
	 * @return a resource
	 */
	public R getResource() {
		return resource;
	}

	/**
	 * method which emptying the {@link ResourcefulUser}.
	 */
	public void resetResource() {
		this.resource = null;
	}

	/**
	 * method which modifying the {@link ResourcefulUser}.
	 * 
	 * @param r
	 *            new resource from the {@link ResourcefulUser}
	 */
	public void setResource(R r) {
		this.resource = r;
	}

	/**
	 * method returning a name of the user of the {@link ResourcefulUser}
	 * 
	 * @return
	 */
	public String getNameUser() {
		return this.nameUser;
	}

}
