package com.kazdo.state_pattern;

public class OpenGateState implements GateState {

	private Gate gate;

	public OpenGateState(Gate gate) {
		this.gate = gate;
	}

	public void inform() {
		// Do nothing...
	}

	public void validate() {
		// Do nothing...
	}

	public void inValidate() {
		// Do nothing...
	}

	public void enter() {
		gate.changeState(GateStateFactory.getGateState(GateStateType.CLOSE, gate));
	}

}
