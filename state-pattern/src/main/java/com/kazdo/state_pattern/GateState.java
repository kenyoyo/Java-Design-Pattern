package com.kazdo.state_pattern;

public interface GateState {

	public void inform();

	public void validate();

	public void inValidate();

	public void enter();

}
