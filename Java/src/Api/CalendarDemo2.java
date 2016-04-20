package Api;

import java.util.Calendar;

public class CalendarDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH,18);
		sop(c);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
