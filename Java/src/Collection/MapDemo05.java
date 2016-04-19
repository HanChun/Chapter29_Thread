package Collection;

import java.util.HashMap;
import java.util.Iterator;

/*
 * 
 */
public class MapDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> class1 = new HashMap<String,String>();
		class1.put("01", "zhangsan");
		HashMap<String,String> class2 = new HashMap<String,String>();
		class2.put("02", "zhaoliu");
		
		HashMap<String , HashMap<String,String>> czbk = new HashMap<String,HashMap<String,String>>();
		czbk.put("1",class1);
		czbk.put("2", class2);
		
		Iterator<String> it =czbk.keySet().iterator();
		while(it.hasNext()){
			String roomName = it.next();
			HashMap<String,String> room = czbk.get(roomName);
			getStudentInfo(room);
		}
		
		getStudentInfo(class1);
		getStudentInfo(class2);
	}
	
	public static void getStudentInfo(HashMap<String,String> roomMap){
		Iterator<String> it = roomMap.keySet().iterator();
		while(it.hasNext()){
			String id = it.next();
			String name = roomMap.get(id);
			System.out.println(id+":"+name);
		}		
	}
}




































