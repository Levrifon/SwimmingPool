package resource;

/**
 * class which handle a resource used by a swimmer
 * 
 * @author Dimitri Charneux, Rémy Debue
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
	 *            name of the swimmer which used a resource.
	 */
	public ResourcefulUser(String nameUser) {
		this.nameUser = nameUser;
	}

	/**
	 * Method which return the resource of the {@link ResourcefulUser}.
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
	 * @return name of the user
	 */
	public String getNameUser() {
		return this.nameUser;
	}

}
