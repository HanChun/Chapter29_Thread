package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * Map集合存储键值对，一对一对往里面存，保证键的唯一性；
 * 1、添加
 * 2、删除 clear()
 * 3、判断
 * 
 * 4、获取
 * 
 * Map
 * 		|---Hashtable 底层是哈希表的数据结构，不可以存入null键null值；该集合是线程同步的；jdk1.0
 * 		|---HashMap	底层是哈希表的数据结构，可以入null键null值；该集合不同步；jdk1.2（效率高）
 * 		|---TreeMap	底层是二叉树。线程不同步，可以用于给map集合中的键进行排序
 * 
 * 和set很像
 * 其实，set集合底层就是使用了map集合
 */
public class MapDemo01 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("01", "zhangsan1");//put方法会返回来键对应的原来的值
		map.put("01", "zhangsan1");
		map.put("01", "zhangsan1");
		
		System.out.println("containsKey:"+ map.containsKey("02"));
		//System.out.println("remove:"+ map.remove("022"));
		System.out.println("get:"+map.get("02"));
		
		map.put(null,"aha");
		System.out.println("get:"+map.get(null));
		
		//获取map集合中所有的值
		Collection<String> coll = map.values();
		System.out.println(coll);
		
		System.out.println(map);
	}
}























