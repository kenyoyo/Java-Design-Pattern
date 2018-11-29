package com.kazdo.command_pattern;

public class StereoCommandFactory {
	
	private StereoCommandFactory() {
		
	}
	
	public static StereoCommand getCommand(CommandType commandType, Stereo stereo) {
		if(commandType.equals(CommandType.TURNON))
			return new TurnOnCommand(stereo);
		else if(commandType.equals(CommandType.TURNOFF))
			return new TurnOffCommand(stereo);
		else if(commandType.equals(CommandType.VOLUMNUP))
			return new VolumnUpCommand(stereo);
		else if(commandType.equals(CommandType.VOLUMNDOWN))
			return new VolumnDownCommand(stereo);
		else 
			return null;
	}
	
}
