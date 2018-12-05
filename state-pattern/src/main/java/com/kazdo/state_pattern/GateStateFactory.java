package com.kazdo.state_pattern;

public class GateStateFactory {

	public static GateState getGateState(GateStateType gateStateType, Gate gate) {
		if (gateStateType.equals(GateStateType.CLOSE))
			return new CloseGateState(gate);
		else if (gateStateType.equals(GateStateType.PROCESSING))
			return new ProcessingGateState(gate);
		else if (gateStateType.equals(GateStateType.OPEN))
			return new OpenGateState(gate);
		else
			return null;
	}

}
