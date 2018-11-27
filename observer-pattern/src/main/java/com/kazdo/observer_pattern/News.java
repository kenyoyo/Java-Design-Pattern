package com.kazdo.observer_pattern;

import java.util.List;
import java.util.ArrayList;

public abstract class News implements IObservable{
	
	private String content;
	private List<IObserver> receiverList;
	
	public News() {
		content = "default";
		receiverList = new ArrayList<>();
	}
	
	public void add(IObserver receive) {
		receiverList.add(receive);
	}

	public void remove(IObserver receive) {
		receiverList.remove(receive);
	}

	public void notice() {
		for(IObserver observe : receiverList) {
			observe.update(this);
		}
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
