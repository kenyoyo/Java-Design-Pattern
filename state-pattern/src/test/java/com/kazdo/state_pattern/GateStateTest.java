package com.kazdo.state_pattern;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GateStateTest {

	private Gate gate;

	@Before
	public void setupGate() {
		gate = new Gate();
	}

	@Test
	public void testDefaultStateWhenCreateGate() {
		assertEquals(CloseGateState.class, gate.getCurrentState().getClass());
	}

	@Test
	public void testInformToCloseGateState() {
		gate.inform();

		assertEquals(ProcessingGateState.class, gate.getCurrentState().getClass());
	}

	public void testValidateToProcessingGateState() {
		gate.inform();
		gate.validate();

		assertEquals(OpenGateState.class, gate.getCurrentState().getClass());
	}

	public void testInValidateToProcessingGateState() {
		gate.inform();
		gate.inValidate();

		assertEquals(CloseGateState.class, gate.getCurrentState().getClass());
	}

	public void testEnterToOpenGateState() {
		gate.inform();
		gate.validate();
		gate.enter();

		assertEquals(CloseGateState.class, gate.getCurrentState().getClass());
	}

}
