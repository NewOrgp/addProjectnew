package software;

import java.time.LocalDate;

public class book {
	String title;
	String auther;
	String code;
	boolean borrowed;
	LocalDate borrowingDate; 
	public book() {
		
	}
	public book(String t,String a,String c) {
		title=t;
		auther=a;
		code=c;
		borrowed =false;
		borrowingDate=LocalDate.now();		
	}
}
