package org.mark;
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class TomatoClock{
	private static int tomatoTime;
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void main(String args[]){
		tomatoTime=inputTomatoTime();
		startTomato();
		endTomato();
	}
private static int inputTomatoTime(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Please input the tomatoTime(minute)");
	int t=sc.nextInt();
	return t;
}

private static void startTomato(){
	Date date=new Date();
	Calendar calendar=Calendar.getInstance();
	calendar.setTime(date);
	calendar.add(Calendar.MINUTE,tomatoTime);
	Date endTime=calendar.getTime();
	System.out.println(endTime);
    calendar.setTime(date);
    calendar.add(Calendar.SECOND,10);
    System.out.println(calendar.getTime());
    timesUP(endTime);

	while(!timesUP(endTime)){

		if (timesUP(calendar.getTime())){
		System.out.println(calendar.getTime());
		calendar.add(Calendar.SECOND,10)	;
		}
		
	}
	System.out.println("end");
	}
private static boolean timesUP(Date d){
	//System.out.println(dateFormat.format(d));
	//System.out.println(dateFormat.format(new Date()));
	return dateFormat.format(d).equals(dateFormat.format(new Date()));
}

private static void endTomato(){
	new ReminderJFrame(300,400);
};
}