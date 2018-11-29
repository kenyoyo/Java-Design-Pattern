package com.kazdo.command_pattern;

public class Invoker {
	
	private ICommand turnOn;
	private ICommand turnOff;
	private ICommand volumnUp;
	private ICommand volumnDown;
	
	public Invoker(ICommand turnOn, ICommand turnOff, ICommand volumnUp, ICommand volumnDown) {
		super();
		this.turnOn = turnOn;
		this.turnOff = turnOff;
		this.volumnUp = volumnUp;
		this.volumnDown = volumnDown;
	}
	
	public void pressTurnOn() {
		turnOn.execute();
	}
	
	public void pressTurnOff() {
		turnOff.execute();
	}
	
	public void pressVolumnUp() {
		volumnUp.execute();
	}
	
	public void pressVolumnDown() {
		volumnDown.execute();
	}
	
}
