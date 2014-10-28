package action;
import java.util.Iterator;

/**
 * 
 * @author Dimitri Charneux, Rémy Debue
 *
 */
public class FairScheduler extends Scheduler {
	protected Iterator<Action> actionIterator;
	public FairScheduler() {
		super();
		actionIterator = actions.iterator();
	}
	@Override
	protected void removeAction() {
		actionIterator.remove();
	}
	/**
	 * return the next action of the list
	 */
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
	/**
	 * Add a swimmer in the action's list
	 * @param swimmer
	 */
	public void addAction(Swimmer swimmer) {
		actions.add(swimmer);
		actionIterator = actions.iterator();
	}
	
	

}
