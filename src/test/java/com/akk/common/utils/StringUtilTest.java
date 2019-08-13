package com.akk.common.utils;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		
		
	}

	@Test
	public void testHasText() {
	}

	@Test
	public void testRandomChineseString() throws UnsupportedEncodingException {
		
		  System.out.println(StringUtil.randomChineseString(10));  
		  System.out.println(StringUtil.randomChineseString(10)); 
		
		
	}

	@Test
	public void testGenerateChineseName() {
		// System.out.println(StringUtil.generateChineseName());  
		for(int i =0 ;i <13 ; i++) {
			 System.out.println(StringUtil.generateChineseName());  
		}
	}

}
