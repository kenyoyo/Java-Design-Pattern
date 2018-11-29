package com.kazdo.command_pattern;

public class Stereo {

	private boolean isTurnOn;
	private int volumnLevel;

	public boolean isTurnOn() {
		return isTurnOn;
	}

	public int getVolumnLevel() {
		return volumnLevel;
	}

	public void turnOn() {
		isTurnOn = true;
	}

	public void turnOff() {
		isTurnOn = false;
	}

	public void volumeUp() {
		if (isTurnOn) {
			if (volumnLevel < 5)
				volumnLevel++;
		}
	}

	public void volumnDown() {
		if (isTurnOn) {
			if (volumnLevel > 0)
				volumnLevel--;
		}
	}

}
