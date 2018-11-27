package com.kazdo.observer_pattern;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class NewsTest {
	
	private NewsFactory newsFactory;
	
	@Before
	public void setup() {
		newsFactory = new NewsFactory();
	}
	
	@Test
	public void testOneNewsObservableToOneReceiverObserver() {
		News sportNews = newsFactory.createNews(NewsType.SPORTNEWS);
		Receiver receiver = new Receiver();
		receiver.register(sportNews);
		sportNews.setContent("Arsenal 3 - 1 Chelsea");
		sportNews.notice();
		
		assertEquals(2, receiver.getContent().size());
	}
	
	@Test
	public void testOneNewsObservableToTwoReceiverObserver() {
		News sportNews = newsFactory.createNews(NewsType.SPORTNEWS);
		Receiver receiver1 = new Receiver();
		Receiver receiver2 = new Receiver();
		receiver1.register(sportNews);
		receiver2.register(sportNews);
		sportNews.setContent("Arsenal 3 - 1 Chelsea");
		sportNews.notice();
		
		assertEquals(2, receiver1.getContent().size());
		assertEquals(2, receiver2.getContent().size());
	}
	
	@Test
	public void testTwoNewsObservableToOneReceiverObserver() {
		News sportNews = newsFactory.createNews(NewsType.SPORTNEWS);
		News starNews = newsFactory.createNews(NewsType.STARNEWS);
		Receiver receiver = new Receiver();
		receiver.register(sportNews);
		receiver.register(starNews);
		sportNews.setContent("Arsenal 3 - 1 Chelsea");
		sportNews.notice();
		starNews.setContent("Avatar is amazing movie");
		starNews.notice();
		
		assertEquals(4, receiver.getContent().size());
	}
	
	@Test
	public void testTwoNewsObservableToTwoReceiverObserver() {
		News sportNews = newsFactory.createNews(NewsType.SPORTNEWS);
		News starNews = newsFactory.createNews(NewsType.STARNEWS);
		Receiver receiver1 = new Receiver();
		Receiver receiver2 = new Receiver();
		receiver1.register(sportNews);
		receiver1.register(starNews);
		receiver2.register(sportNews);
		receiver2.register(starNews);
		sportNews.setContent("Arsenal 3 - 1 Chelsea");
		sportNews.notice();
		starNews.setContent("Avatar is amazing movie");
		starNews.notice();
		
		assertEquals(4, receiver1.getContent().size());
		assertEquals(4, receiver2.getContent().size());
	}
	
}
