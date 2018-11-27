package com.kazdo.observer_pattern;

public class NewsFactory {
	
	public News createNews(NewsType newsType) {
		if(newsType.equals(NewsType.SPORTNEWS))
			return new SportNews();
		else if(newsType.equals(NewsType.STARNEWS))
			return new StarNews();
		else
			return null;
	}
	
}
