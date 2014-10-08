import java.util.Iterator;


public class FairScheduler extends Scheduler {
	protected Iterator<Action> actionIterator;
	public FairScheduler() {
		actionIterator = actions.iterator();
	}
	@Override
	protected void removeAction() {
		actionIterator.remove();
	}

	@Override
	protected Action nextAction() {
		if(actionIterator.hasNext()) {
			return actionIterator.next();
		} else {
			actionIterator = actions.iterator();
			if(actionIterator.hasNext()) {
				return actionIterator.next();
			} else {
				return null;
			}
		}
		
	}

}
