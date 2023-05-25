package software;

import java.time.LocalDate;

public class DateServer {
	public LocalDate getDate() {
		LocalDate today =  LocalDate.now();  
		return today;
	}
}
