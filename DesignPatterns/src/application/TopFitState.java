package application;

public class TopFitState implements State {

	private final Lebewesen lebewesen;

	public TopFitState(Lebewesen lebewesen) {
		this.lebewesen = lebewesen;
	}

	@Override
	public void laufen() {
		System.out.println("TopFit laufen");
		this.lebewesen.setCurrentState(this.lebewesen.getNormalState());
	}

}
