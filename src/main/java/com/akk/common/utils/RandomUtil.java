package com.akk.common.utils;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {

	// ����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	
	public static int random(int min, int max) {
		Random r = new  Random();
		int i = r.nextInt(max - min +1 )  +min;
		return i;
	}

	// ����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ���
	// (8��)
	public static int[] subRandom(int min, int max, int subs) {
		   //����һ������,����ȡ���� subs
		   int[] a=new int[subs]; 
		   
		   //����set����
		   HashSet<Integer> set = new HashSet<Integer>();
		   //ѭ����ȡ�����
		    while(set.size()<subs) {
			  set.add( random(min,max));
		  }
		    //����set��������
		    
		    System.out.println(set);
		return a;
	}

	// ����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter() {
		String str ="123456789qazwsxedcrfvtgbyhnujmikolpQZWXEDCRFVTGBYHNUJMIKOLP";
		//���������ֵ  �� �ַ��� 0 -�ַ�������֮��
		int i = random(0,str.length()-1);
		char c= str.charAt(i);
		return c;
		
	}

	// ����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length) {
		
		String str="";
		for(int i = 0; i<length;i++) {
			str+= randomCharacter();
		}
		return str;
	}
}
