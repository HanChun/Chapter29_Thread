package Api;

import java.util.Iterator;
import java.util.Properties;

/*
 * System�����еķ��������Զ��Ǿ�̬��
 * ��ȡϵͳ������Ϣ
 */
public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = System.getProperties();
		
		System.setProperty("mykey", "myvalue");
		
		//��ȡָ��������Ϣ
		String value1 = System.getProperty("mykey");
		System.out.println("value="+value1);
		//��Ϊhashtable�����࣬��map������
		//Iterator it = prop.keySet().iterator();
		for(Object obj : prop.keySet()){
			String value = (String)prop.get(obj);
			System.out.println(obj+"::"+value);
		}		
	}
}
