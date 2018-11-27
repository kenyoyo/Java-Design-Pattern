package com.kazdo.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Receiver implements IObserver{
	
	private List<String> contentList;
	
	public Receiver() {
		contentList = new ArrayList<>();
	}
	
	@Override
	public void update(IObservable updateNews) {
		if(updateNews.getClass().equals(News.class)) {
			News news = (News) updateNews;
			addContent(news.getContent());
		}
	}
	
	public void addContent(String content) {
		contentList.add(content);
	}
	
	public void clearContent() {
		contentList.clear();
	}
	
	public List<String> getContent() {
		return contentList;
	}
	
	public void register(News news) {
		news.add(this);
	}
	
	public void unRegister(News news) {
		news.remove(this);
	}

}
