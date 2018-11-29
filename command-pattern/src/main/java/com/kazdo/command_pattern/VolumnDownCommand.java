package com.kazdo.command_pattern;

public class VolumnDownCommand extends StereoCommand {

	public VolumnDownCommand(Stereo stereo) {
		super(stereo);
	}

	@Override
	public void execute() {
		getStereo().volumnDown();
	}

	@Override
	public void unexecute() {
		getStereo().volumeUp();
	}

}
