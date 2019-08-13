package com.akk.common.utils;

import java.util.regex.Pattern;

import org.junit.Test;

public class PatternUitlsTest {

	@Test
	public void testGetNumberFromUrl() {
		String url="https://3w.huanqiu.com/a/288fc5/7P05pNjU83m?agt=20&tt_group_id=67230787.html";
		Integer url2 = PatternUitl.getNumberFromUrl(url);
		System.out.println(url2);
	}

	@Test
	public void testStrToNum() {
		String url="http://news.cnstock.com/news/yw-201908-4413224-999999-htm|"
				+ "http://news.cnstock.com/news/yw-201908-4413224.htm |"
				+ "http://news.cnstock.com/news/yw-201908-4413224.htm|"
				+ "http://news.cnstock.com/news/yw-201908-4413224.htm|"
				+ "http://news.cnstock.com/news/yw-201908-4413224.htm|";
		String[] split = url.split("\\|");
		for (String string : split) {
		//	System.out.println(string);
		//	System.out.println("number:"+PatternUitl.getNumberFromUrl(url));
			System.out.println("rq:"+PatternUitl.getRqFromUrl(url));
			
		}
	}
	

}
