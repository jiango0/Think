package com.jzc.think.first;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestMain {
	
	public static void main(String[] args) throws ParseException{
//		for(int i =0;i<100;i++){
//			int max=8;
//	        int min=0;
//	        Random random = new Random();
//
//	        int s = random.nextInt(max)%(max-min+1) + min;
//	        System.out.println(s);
//		}
//		int[] max = { 67, 69, 75, 87, 89, 90, 99, 100 };
//		getMax(max);
//		System.out.println(getMax(max));
		
//		startDate();
		
//		cal(format.parse("2017-5-31"));
		
		System.out.println(getWeek(new Date()));
	}
	
	private static int getMax(int[] score) {
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score.length - i - 1; j++) {
				if (score[j] < score[j + 1]) { // 把小的值交换到后面
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
		}

		return score[0];
	}
	
	public static void startDate(){
		System.out.println(new Date());
		System.out.println(new Timestamp(new Date().getTime()));
	}
	
	static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
	public static void cal(Date date){
		Calendar start = Calendar.getInstance();
		start.setTime(date);
		start.add(Calendar.MONTH, 0);
		start.set(Calendar.DAY_OF_MONTH,1);
		
		System.out.println(format.format(start.getTime()));
		
		Calendar end = Calendar.getInstance();
		end.setTime(date);
		end.set(Calendar.DAY_OF_MONTH, end.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println(format.format(end.getTime()));
		
	}
	
	private static String getWeek(Date date){
		String[] weekDays = new String[]{"周日", "周一", "周二", "周三", "周四", "周五 ", "周六"};
		Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        
        return weekDays[w];
	}
	
}
