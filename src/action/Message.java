package action;

public class Message extends Action {
	private String message;
	private boolean fini;
	
	public Message(String message) {
		this.message = message;
		this.fini = false;
	}

	@Override
	public boolean isFinished() {
		return this.fini;
	}

	@Override
	protected void doRealStep() {
		System.out.println(message);
		fini = true;
	}

}
