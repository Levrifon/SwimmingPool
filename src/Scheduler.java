import java.util.ArrayList;
import java.util.List;

import exception.ActionFinishedException;


public abstract class Scheduler extends Action {
	protected List<Action> actions;
	
	public Scheduler() {
		super();
		actions = new ArrayList<Action>();
	}
	@Override
	public boolean isFinished() {
		return actions.isEmpty();
	}
	
	public void add(Action a) {
		actions.add(a);
	}

	@Override
	protected void doRealStep() {
		Action next = nextAction();
		try{
			next.doStep();
		}catch(ActionFinishedException e){
			e.printStackTrace();
		}
		if(next.isFinished()) {
			this.removeAction();
		}
	}
	protected abstract void removeAction();
	protected abstract Action nextAction(); 

}
