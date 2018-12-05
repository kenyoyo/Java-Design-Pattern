package com.kazdo.state_pattern;

public class CloseGateState implements GateState {

	private Gate gate;

	public CloseGateState(Gate gate) {
		this.gate = gate;
	}

	public void inform() {
		gate.changeState(GateStateFactory.getGateState(GateStateType.PROCESSING, gate));
	}

	public void validate() {
		// Do nothing...
	}

	public void inValidate() {
		// Do nothing...
	}

	public void enter() {
		// Do nothing...
	}

}
