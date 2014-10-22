package action;

public class Unwear extends ForeseeableAction {
	private Swimmer swimmer;
	
	public Unwear(int rs, Swimmer sw) {
		super(rs);
		swimmer = sw;
	}

	@Override
	protected void doRealStep() {
		super.doRealStep();
		System.out.println(swimmer.getName()+ " se deshabille ("+ super.remainingSteps + "/" + super.totalSteps + ")");
	}
}
