package action;
import exception.ActionFinishedException;

/**
 * 
 * @author Dimitri Charneux, Remy Debue
 *
 */
public abstract class Action {
protected boolean ready;
	/**
	 * Constructor of the class Action
	 */
	public Action() {
		this.ready = true;
	}
	/**
	 * method which call doRealStep and set ready to false
	 * @throws ActionFinishedException
	 */
	public void doStep() throws ActionFinishedException {
		if(this.isFinished()) throw new ActionFinishedException();
		this.doRealStep();
		this.ready = false;
			
	}
	
	public abstract boolean isFinished();
	/**
	 * 
	 * @return if is in progress
	 */
	public boolean isInProgress() {
		return ((!isReady()) && (!isFinished()));
	}
	/**
	 * 
	 * @return ready
	 */
	public boolean isReady() {
		return ready;
	}
	protected abstract void doRealStep();

}
