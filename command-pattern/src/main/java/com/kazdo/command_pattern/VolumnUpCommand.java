package com.kazdo.command_pattern;

public class VolumnUpCommand extends StereoCommand {

	public VolumnUpCommand(Stereo stereo) {
		super(stereo);
	}

	@Override
	public void execute() {
		getStereo().volumeUp();
	}

	@Override
	public void unexecute() {
		getStereo().volumnDown();
	}
	
}
