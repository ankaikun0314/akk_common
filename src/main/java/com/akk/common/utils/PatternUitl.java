package com.akk.common.utils;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternUitl {
	
	  /**
	   * ���ݹ����ȡURL������,��תΪ����
	   * @Title: getRqFromUrl 
	   * @Description: TODO
	   * @param url
	   * @return
	   * @return: Date
	   */
	public static Date  getRqFromUrl(String url) {
		//�������
		String pattern ="-(\\d+)-";
		//�������
		Pattern c = Pattern.compile(pattern);
		//ƥ�����
		 Matcher m = c.matcher(url);
		 //����ƥ����������
		 if(m.find()) {
		   return StringUtil.strToDate(m.group(1));
		 }
		return null;
		
	}
	
	
	/**
	 * ��url ��ȡ ��������
	 * @Title: getNumberFromUrl 
	 * @Description: TODO
	 * @param url
	 * @return: void
	 */
	public static Integer getNumberFromUrl(String url) {
		//
		String pattern ="[0-9]+(?=[^0-9]*$)";
		 Pattern c = Pattern.compile(pattern);
		 Matcher matcher = c.matcher(url);
		 if(matcher.find()) {
		  String str =matcher.group();
		  return StringUtil.strToInteger(str);
		 }
		return null;

	}
	
	
	
	
	/**
	 * �ж��Ƿ�Ϊ��������
	 * @Title: strToNum 
	 * @Description: TODO
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public boolean strToNum(String str) {
		String pattern ="^[0-9]*$";
		Pattern c = Pattern.compile(pattern);
		Matcher matcher = c.matcher(str);
		return matcher.find();
	}
	}
