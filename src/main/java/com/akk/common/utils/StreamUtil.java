package com.akk.common.utils;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
	public static List<String> readFile(InputStream in) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		List<String> list = new ArrayList<>();
		String lineText = null;
		try {
			while ((lineText = reader.readLine()) != null) {

				list.add(lineText);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;

	}
	/*
	 * ����1�������ر����������ܴ����޸���(3��) ���紫��FileInputStream����JDBC��Connection���󶼿��Թرա�
	 */
	public static void closeAll(AutoCloseable... autoCloseable) {
		for (AutoCloseable able : autoCloseable) {
			try {
				able.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * ����2������һ���ı��ļ�����Ĭ��ΪUTF-8���룬���ظ��ļ�����(3��)��Ҫ�󷽷��ڲ����������1�������ر���(3��)
	 */
	public static String readTextFile(InputStream src) throws IOException {
		
		//���������
		 ByteArrayOutputStream out = new ByteArrayOutputStream();

		 String str=null ;
		 
		byte[] b =new byte[1024];
		int x;
		while((x= src.read(b))!=-1) {
			out.write(b);
		}
		//�ر���
		closeAll(out,src);
		
		return out.toString("utf-8");
		
		
		
	
	}

	/*
	 * ����3�������ı��ļ����󣬷��ظ��ļ�����(3��)������Ҫ���ڲ����������2������(5��)��* ���ǵ��͵ķ������أ���ס�������ꡭ
	 */
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException {
	   return readTextFile(new FileInputStream(txtFile));
	}

}
