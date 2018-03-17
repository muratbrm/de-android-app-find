package application;

public class Lebewesen {
	private State currentState;
	private NormalState normalState;
	private ErschöpftState erschöpftState;
	private TopFitState topFitState;
	
	public Lebewesen() {
		this.erschöpftState = new ErschöpftState(this);
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

	public ErschöpftState getErschöpftState() {
		return erschöpftState;
	}

	public TopFitState getTopFitState() {
		return topFitState;
	}
}
