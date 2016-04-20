package Api;

import java.text.SimpleDateFormat;
import java.util.Date;
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyÄêMMÔÂddÈÕ hh:mm:ss");
		String time = sdf.format(d);
		System.out.println("time="+time);
	}
}
