package com.akk.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		
		for(int i =0;i<10;i++) {
		int x = RandomUtil.random(1,3);
		System.out.println(x);
		}
		
		
	}

	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1, 10, 3);
	}

	@Test
	public void testRandomCharacter() {
		for(int i =0;i<10;i++) {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
		}
	}

	@Test
	public void testRandomString() {
		
		for(int i =0;i<10;i++) {
			String string = RandomUtil.randomString(4);
			System.out.println(string);
		}
	}

}
