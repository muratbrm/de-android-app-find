package application;

public class Lebewesen {
	private State currentState;
	private NormalState normalState;
	private Ersch�pftState ersch�pftState;
	private TopFitState topFitState;
	
	public Lebewesen() {
		this.ersch�pftState = new Ersch�pftState(this);
		this.topFitState = new TopFitState(this);
		this.normalState = new NormalState(this);
		this.currentState = normalState;
	}
	
	public void laufen(){
		this.currentState.laufen();
	}
	
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public NormalState getNormalState() {
		return normalState;
	}

	public Ersch�pftState getErsch�pftState() {
		return ersch�pftState;
	}

	public TopFitState getTopFitState() {
		return topFitState;
	}
}
