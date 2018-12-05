package com.kazdo.state_pattern;

public class ProcessingGateState implements GateState {

	private Gate gate;

	public ProcessingGateState(Gate gate) {
		this.gate = gate;
	}

	public void inform() {
		// Do nothing...
	}

	public void validate() {
		gate.changeState(GateStateFactory.getGateState(GateStateType.OPEN, gate));
	}

	public void inValidate() {
		gate.changeState(GateStateFactory.getGateState(GateStateType.CLOSE, gate));
	}

	public void enter() {
		// Do nothing...
	}

}
