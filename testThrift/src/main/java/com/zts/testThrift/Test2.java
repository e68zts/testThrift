package com.zts.testThrift;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {

	public static void main(String[] args) throws ParseException {
		System.out.println("start。。。。。。");
		long time = new Date().getTime();
		System.out.println(time);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date(time)));
		System.out.println("================");
		//1483286340000
		
		System.out.println(sdf.format(new Date(1483286340000L)));
		
		System.out.println("================");
		Date parse = sdf.parse("2017-06-18 10:27:52");
		System.out.println(parse.getTime());
		
		
	}
}
