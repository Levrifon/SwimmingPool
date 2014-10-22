package action;

public class SequentialScheduler extends Scheduler {

	@Override
	protected void removeAction() {
		this.actions.remove(0);
	}

	@Override
	protected Action nextAction() {
		return this.actions.get(0);
	}
	
	public void doRealStep(){
		Action action = nextAction();
		action.doRealStep();
		if(action.isFinished()){
			removeAction();
		}
	}

}
