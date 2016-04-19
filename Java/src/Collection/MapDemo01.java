package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * Map���ϴ洢��ֵ�ԣ�һ��һ��������棬��֤����Ψһ�ԣ�
 * 1�����
 * 2��ɾ�� clear()
 * 3���ж�
 * 
 * 4����ȡ
 * 
 * Map
 * 		|---Hashtable �ײ��ǹ�ϣ������ݽṹ�������Դ���null��nullֵ���ü������߳�ͬ���ģ�jdk1.0
 * 		|---HashMap	�ײ��ǹ�ϣ������ݽṹ��������null��nullֵ���ü��ϲ�ͬ����jdk1.2��Ч�ʸߣ�
 * 		|---TreeMap	�ײ��Ƕ��������̲߳�ͬ�����������ڸ�map�����еļ���������
 * 
 * ��set����
 * ��ʵ��set���ϵײ����ʹ����map����
 */
public class MapDemo01 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("01", "zhangsan1");//put�����᷵��������Ӧ��ԭ����ֵ
		map.put("01", "zhangsan1");
		map.put("01", "zhangsan1");
		
		System.out.println("containsKey:"+ map.containsKey("02"));
		//System.out.println("remove:"+ map.remove("022"));
		System.out.println("get:"+map.get("02"));
		
		map.put(null,"aha");
		System.out.println("get:"+map.get(null));
		
		//��ȡmap���������е�ֵ
		Collection<String> coll = map.values();
		System.out.println(coll);
		
		System.out.println(map);
	}
}























