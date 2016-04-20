package Api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Calendar c = Calendar.getInstance();
		
		String[] mons ={"一月","2","",""};
		int num= c.get(Calendar.MONTH); 
				
		sop(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1) +"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
		
		
		/*Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年");
		String year = sdf.format(d);
		System.out.println(year);*/
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
