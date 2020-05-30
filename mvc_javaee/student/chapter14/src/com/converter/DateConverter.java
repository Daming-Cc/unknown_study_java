package com.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/*
 * ���������Զ������ڵ�ת����
 */
public class DateConverter implements Converter<String,Date>{
	//�������ڸ�ʽ
	private String datePattern = "yyyy-MM-dd HH:mm:ss";
	public Date convert(String source) {
		//��ʽ���������Ͷ���
		SimpleDateFormat sdf =  new SimpleDateFormat();
		
		try {
			return sdf.parse(source);
		} catch (ParseException e) {
			throw new IllegalArgumentException("��Ч����������,��ʹ�����ָ�ʽ");
		}
	}
	
}
