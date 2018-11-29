package com.kazdo.command_pattern;

public abstract class StereoCommand implements ICommand {
	
	private Stereo stereo;

	public StereoCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}
	
	public Stereo getStereo() {
		return stereo;
	}
	
	public abstract void execute();
	
	public abstract void unexecute();
	
}
