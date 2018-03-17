package application;

public class Ersch�pftState implements State {
	
	private final Lebewesen lebewesen;

	public Ersch�pftState(Lebewesen lebewesen) {
		this.lebewesen = lebewesen;
	}

	@Override
	public void laufen() {
		System.out.println("Ersch�pft laufen");
		this.lebewesen.setCurrentState(this.lebewesen.getTopFitState());
	}

}
