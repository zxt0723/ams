package com.haibei.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 
 * spring mvc �����ڴ���[ǰ̨-��̨]bug: org.springframework.validation.BindException
 * �Ľ����ʽ.����xml������
 * 
 * @author zxt
 * 
 */

public class DateConverter implements Converter<String, Date> {
	@Override
	public Date convert(String source) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateFormat.setLenient(false);
		try {
			return dateFormat.parse(source);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
