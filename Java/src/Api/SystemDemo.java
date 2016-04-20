package Api;

import java.util.Iterator;
import java.util.Properties;

/*
 * System：类中的方法和属性都是静态的
 * 获取系统属性信息
 */
public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = System.getProperties();
		
		System.setProperty("mykey", "myvalue");
		
		//获取指定属性信息
		String value1 = System.getProperty("mykey");
		System.out.println("value="+value1);
		//其为hashtable的子类，即map的子类
		//Iterator it = prop.keySet().iterator();
		for(Object obj : prop.keySet()){
			String value = (String)prop.get(obj);
			System.out.println(obj+"::"+value);
		}		
	}
}
