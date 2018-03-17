package application;

public class NormalState implements State {

	private final Lebewesen lebewesen;

	public NormalState(Lebewesen lebewesen) {
		this.lebewesen = lebewesen;
	}

	@Override
	public void laufen() {
		System.out.println("Normal laufen");
		this.lebewesen.setCurrentState(this.lebewesen.getErschöpftState());
	}

}
