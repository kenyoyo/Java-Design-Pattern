package com.kazdo.observer_pattern;

public interface IObservable {
	
	public void add(IObserver observe);
	public void remove(IObserver observe);
	public void notice();
	
}
