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

}
