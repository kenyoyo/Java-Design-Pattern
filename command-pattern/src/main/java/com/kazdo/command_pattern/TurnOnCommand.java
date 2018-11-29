package com.kazdo.command_pattern;

public class TurnOnCommand extends StereoCommand {

	public TurnOnCommand(Stereo stereo) {
		super(stereo);
	}

	@Override
	public void execute() {
		getStereo().turnOn();
	}

	@Override
	public void unexecute() {
		getStereo().turnOff();
	}

}
