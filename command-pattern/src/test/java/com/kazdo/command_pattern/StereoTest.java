package com.kazdo.command_pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StereoTest {
	
		private Invoker invoker;
		private Stereo stereo;
		
	@Before
	public void setup() {
		stereo = new Stereo();
		
		StereoCommand turnOn = StereoCommandFactory.getCommand(CommandType.TURNON, stereo);
		StereoCommand turnOff = StereoCommandFactory.getCommand(CommandType.TURNOFF, stereo);
		StereoCommand volumnDown = StereoCommandFactory.getCommand(CommandType.VOLUMNDOWN, stereo);
		StereoCommand volumnUp = StereoCommandFactory.getCommand(CommandType.VOLUMNUP, stereo);
		
		invoker = new Invoker(turnOn, turnOff, volumnUp, volumnDown);
	}
	
	@Test
	public void testTurnOnStereo() {
		invoker.pressTurnOn();
		assertTrue(stereo.isTurnOn());
	}
	
	@Test 
	public void testTurnOffStereo() {
		invoker.pressTurnOn();
		invoker.pressTurnOff();
		assertFalse(stereo.isTurnOn());
	}
	
	@Test
	public void testVolumnUp() {
		invoker.pressTurnOn();	//volumn level is 0.
		invoker.pressVolumnUp();	//volumn up by 1.
		invoker.pressVolumnUp();
		assertEquals(2, stereo.getVolumnLevel());
	}
	
	@Test
	public void testVolumDown() {
		invoker.pressTurnOn();
		invoker.pressVolumnUp();
		invoker.pressVolumnUp();
		invoker.pressVolumnDown(); //volumn down by 1.
		assertEquals(1, stereo.getVolumnLevel());
	}
	
}
