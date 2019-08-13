package com.akk.common.utils;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class PatternUitlTest {

	@Test
	public void testGetRqFromUrl() {
		String str="http://news.cnstock.com/news,yw-201905-1613224.htm";
		
		Date date = PatternUitl.getRqFromUrl(str);
		
		System.out.println(date);
		
		
		
		
	}

	@Test
	public void testGetNumberFromUrl() {
		
	String str="http://news.cnstock.com/news,yw-201905-1613224.htm";
		
		Integer integer = PatternUitl.getNumberFromUrl(str);
		
		System.out.println(integer);
	}

	@Test
	public void testStrToNum() {
	}

}
