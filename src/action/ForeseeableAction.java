package action;

public class ForeseeableAction extends Action {
	protected int remainingSteps;
	
	public ForeseeableAction(int rs) {
		this.remainingSteps = rs;
	}
	@Override
	public boolean isFinished() {
		if(remainingSteps < 0) throw new IllegalStateException("Impossible que cela se produise");
		return this.remainingSteps == 0;
	}

	@Override
	protected void doRealStep() {
		this.remainingSteps--;
	}

}
