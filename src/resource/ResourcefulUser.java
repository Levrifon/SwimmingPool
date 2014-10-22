package resource;


public class ResourcefulUser<R extends Resource>{
	protected R resource;
	private String nameUser;
	
	public ResourcefulUser(String nameUser) {
		this.nameUser = nameUser;
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
	
	public String getNameUser() {
		return this.nameUser;
	}

}
