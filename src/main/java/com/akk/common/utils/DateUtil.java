package com.akk.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/*
	 * ����1��(5��) ��һ��ʱ����󣬷��ظ�ʱ�������µ�1��0ʱ0��0�롣����һ��Date�����ֵ��2019-05-18 11:37:22
	 * �򷵻صĽ��Ϊ2019-05-01 00:00:00
	 */
	public static Date getDateByInitMonth(Date src) {
		// ��ȡ������
		Calendar c = Calendar.getInstance();
		// ���ݴ���Ĳ��� ��ʼ��������
		c.setTime(src);
		// ���ô������ڵ��³�
		c.set(Calendar.DAY_OF_MONTH, 1);
		// ����СʱΪ0Сʱ
		c.set(Calendar.HOUR_OF_DAY, 0);
		// ���÷���Ϊ0����
		c.set(Calendar.MINUTE, 0);
		// ������Ϊ0��
		c.set(Calendar.SECOND, 0);

		return c.getTime();
	}

	/*
	 * ����2��(5��) ��һ��ʱ����󣬷��ظ�ʱ�������µ������23ʱ59��59�룬��Ҫ�����´���С�Ͷ������������
	 * ����һ��Date�����ֵ��2019-05-18 11:37:22���򷵻ص�ʱ��Ϊ2019-05-31 23:59:59
	 * ����һ��Date�����ֵ��2019-02-05 15:42:18���򷵻ص�ʱ��Ϊ2019-02-28 23:59:59
	 */
	public static Date getDateByFullMonth(Date src) {
		// ��ȡ������
		Calendar c = Calendar.getInstance();
		// ���ݴ���Ĳ��� ��ʼ��������
		c.setTime(src);
// �ô�����·ݼ�1
		c.add(Calendar.MONTH, 1);
		//���·������ó��³� 2019-08-01 00:00:00
		Date date = getDateByInitMonth(c.getTime());
		c.setTime(date);
		//����-1
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
		// TODO ʵ�ִ���
	}
	
	public static int getAge (Date src) {
		
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		
		
		
		
		return 1;
	
		}
	
}
