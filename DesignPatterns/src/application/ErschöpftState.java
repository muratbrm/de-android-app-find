package application;

public class ErschöpftState implements State {
	
	private final Lebewesen lebewesen;

	public ErschöpftState(Lebewesen lebewesen) {
		this.lebewesen = lebewesen;
	}

	@Override
	public void laufen() {
		System.out.println("Erschöpft laufen");
		this.lebewesen.setCurrentState(this.lebewesen.getTopFitState());
	}

}
