package Api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Calendar c = Calendar.getInstance();
		
		String[] mons ={"һ��","2","",""};
		int num= c.get(Calendar.MONTH); 
				
		sop(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1) +"��"+c.get(Calendar.DAY_OF_MONTH)+"��");
		
		
		/*Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��");
		String year = sdf.format(d);
		System.out.println(year);*/
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
