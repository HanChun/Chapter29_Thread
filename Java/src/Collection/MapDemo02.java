package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*map���ϵ�����ȡ����ʽ
 * 1��keySet:��map�����еļ����뵽Set������ȥ��Set���е�������
 * 		�ٸ���get������ȡÿһ������ֵ
 * 2��entrySet:
 */
public class MapDemo02 {

	public static void main(String[] args) {
		Map<String,String>map = new HashMap<String,String>();
		
		map.put("01", "zhangsan1");//put�����᷵��������Ӧ��ԭ����ֵ
		map.put("01", "zhangsan1");
		map.put("01", "zhangsan1");
		
		/*Set<String> keyset = map.keySet();
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = map.get(key);
			System.out.println("key:"+key+",value:"+ value);
		}*/
		
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> it = entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<String, String>  me = it.next();
			String key = me.getKey();
			String value = me.getValue();
			
			
		}
		
		
	}
}
/*
 * Map.Entry ��ʵEntryҲ��һ���ӿڣ�����Map�ӿ��е�һ���ڲ��ӿ�
 */

/*interface Map{
	public static interface Entry{
		public abstract Object getKey();
		public abstract Object getValue();
	}
}
class HashMap implements Map{
	class Haha implements Map.Entry{
	
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(java.util.Map m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

*/

















