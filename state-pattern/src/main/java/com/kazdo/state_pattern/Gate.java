package com.kazdo.state_pattern;

public class Gate {

	private GateState gateState;

	public Gate() {
		gateState = new CloseGateState(this);
	}

	public void inform() {
		gateState.inform();
	}

	public void validate() {
		gateState.validate();
	}

	public void inValidate() {
		gateState.inValidate();
	}

	public void enter() {
		gateState.enter();
	}

	public void changeState(GateState newState) {
		gateState = newState;
	}

	public GateState getCurrentState() {
		return gateState;
	}

}
