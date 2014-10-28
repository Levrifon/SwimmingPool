package action;

public class Swim extends ForeseeableAction {
	private Swimmer swimmer;
	/**
	 * Constructor of the Action Swim which is Forseeable
	 * @param rs time before the action is finished
	 * @param sw the swimmer
	 */
	public Swim(int rs, Swimmer sw) {
		super(rs);
		swimmer = sw;
	}

	@Override
	protected void doRealStep() {
		super.doRealStep();
		System.out.println(swimmer.getName()+ " nage ("+ super.remainingSteps + "/" + super.totalSteps + ")");
	}
}