package action;

public class Wear extends ForeseeableAction {
	private Swimmer swimmer;
	
	public Wear(int rs, Swimmer sw) {
		super(rs);
		swimmer = sw;
	}

	@Override
	protected void doRealStep() {
		super.doRealStep();
		System.out.println(swimmer.getName()+ " s'habille ("+ super.remainingSteps + "/" + super.totalSteps + ")");
	}
}