package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*map集合的两种取出方式
 * 1、keySet:将map中所有的键存入到Set集合中去；Set中有迭代器，
 * 		再根据get方法获取每一个键的值
 * 2、entrySet:
 */
public class MapDemo02 {

	public static void main(String[] args) {
		Map<String,String>map = new HashMap<String,String>();
		
		map.put("01", "zhangsan1");//put方法会返回来键对应的原来的值
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
 * Map.Entry 其实Entry也是一个接口，它是Map接口中的一个内部接口
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

















