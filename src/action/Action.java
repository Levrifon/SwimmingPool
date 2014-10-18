package action;
import exception.ActionFinishedException;


public abstract class Action {
protected boolean ready;

	public Action() {
		this.ready = true;
	}
	
	public void doStep() throws ActionFinishedException {
		if(this.isFinished()) throw new ActionFinishedException();
		this.doRealStep();
		this.ready = false;
			
	}
	
	public abstract boolean isFinished();
	
	public boolean isInProgress() {
		return ((!isReady()) && (!isFinished()));
	}
	
	public boolean isReady() {
		return ready;
	}
	protected abstract void doRealStep();

}
