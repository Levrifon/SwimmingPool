package action;
/**
 * 
 * @author Dimitri Charneux, Rémy Debue
 *
 */
public class SequentialScheduler extends Scheduler {
/**
 * remove the first action
 */
	@Override
	protected void removeAction() {
		this.actions.remove(0);
	}
	/**
	 * return the first action
	 */
	@Override
	protected Action nextAction() {
		return this.actions.get(0);
	}
	/**
	 * get the next action and do the real step
	 */
	public void doRealStep(){
		Action action = nextAction();
		action.doRealStep();
		if(action.isFinished()){
			removeAction();
		}
	}

}
