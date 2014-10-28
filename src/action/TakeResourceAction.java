package action;

import java.util.NoSuchElementException;

import pool.ResourcePool;
import resource.Resource;
import resource.ResourcefulUser;
/**
 * 
 * @author Dimitri Charneux, Rémy Debue
 *
 * @param <T>
 */
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
		try {
			user.setResource(pool.provideResource());
			System.out.println(user.getNameUser()+ " prend un(e) "+ pool.getResourceName());
			fini = true;
		}catch(NoSuchElementException e) {
			System.out.println(user.getNameUser()+ " attends, il n'y a plus de "+ pool.getResourceName());
		}
		 
		
	}

}
