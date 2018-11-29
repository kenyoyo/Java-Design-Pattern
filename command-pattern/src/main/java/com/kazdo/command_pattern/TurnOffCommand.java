package com.kazdo.command_pattern;

public class TurnOffCommand extends StereoCommand{

	public TurnOffCommand(Stereo stereo) {
		super(stereo);
	}

	@Override
	public void execute() {
		getStereo().turnOff();
	}

	@Override
	public void unexecute() {
		getStereo().turnOn();
	}

}
