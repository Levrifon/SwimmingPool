package action;

public class ForeseeableAction extends Action {
	protected int remainingSteps;
	protected int totalSteps;
	
	public ForeseeableAction(int rs) {
		this.totalSteps = rs;
		this.remainingSteps = 0;
	}
	@Override
	public boolean isFinished() {
		if(remainingSteps > totalSteps) throw new IllegalStateException("Impossible que cela se produise");
		return this.remainingSteps == totalSteps;
	}

	@Override
	protected void doRealStep() {
		this.remainingSteps++;
	}

}
