package com.akk.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() throws ParseException {

		String str = "2017-12-12 12:12:12";

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date = DateUtil.getDateByInitMonth(new Date());
		System.out.println(df.format(date));

	}

	@Test
	public void testGetDateByFullMonth() throws ParseException {

		String str = "2000-02-12 12:12:12";

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date = DateUtil.getDateByFullMonth(df.parse(str));
		System.out.println(df.format(date));
	}

	/**
	 * 
	 * @Title: test1
	 * @Description:String sql = "select * from t_order where create_time>='{1}' and
	 *                     create_time<='{2}' ";
	 *                     灏嗕笂闈1}鐨勪綅缃娇鐢―ateUtil宸ュ叿绫讳腑鐨刧etDateByInitMonth()杩斿洖鍊兼浛鎹�
	 *                     锛屽皢涓婇潰{2}鐨勪綅缃娇鐢―ateUtil宸ュ叿绫讳腑鐨刧etDateByFullMonth()杩斿洖鍊兼浛鎹€��
	 *                     鏈�鍚庢墦鍗板嚭姝ｇ‘鎷兼帴鐨凷QL瀛楃涓层��
	 * @return: void
	 */
	@Test
	public void test1() {
		String sql = "select * from t_order  where create_time>='{1}' and create_time<='{2}' ";
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date = DateUtil.getDateByInitMonth(new Date());
		Date date2 = DateUtil.getDateByFullMonth(new Date());

		String sql2 = sql.replace("{1}", df.format(date)).replace("{2}", df.format(date2));

		System.out.println(sql2);
	}

}
