package Collection;
/*1、add方法的参数类型是object，以便于接收任意类型的参数对象
 *2、集合中存储的都是对象的引用地址
 *
 *迭代器：其实就是集合取出元素的方式；   
 */
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo01 {

	public static void main(String[] args) {
		method_2();
		// 创建一个集合容器，使用collection接口的子类
		ArrayList al = new ArrayList();
		al.add("java01");//add(Object obj)
		al.add("java02");
		al.add("java03");
		al.add("java04");
		
		//打印集合
		sop(al);
		
		//长度 
		sop("size:"+al.size());
		
		//删除元素
		al.remove("java02");  
		sop(al); 
		al.clear();//清空集合
		
		sop("java03是否存在"+al.contains("java03"));
		sop("集合是否为空: "+al.isEmpty());
	}
	public static void method_get(){
		ArrayList al1 = new ArrayList();
		
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");
		
		Iterator it = al1.iterator();//获取迭代器，用于取出集合中的元素
		
		while(it.hasNext()){
			sop(it.next());
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void method_2(){
		ArrayList al1 = new ArrayList();
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");
		
		ArrayList al2 = new ArrayList();
		al2.add("java01");
		al2.add("java02");
		al2.add("java05");
		al2.add("java06");
		
		al1.retainAll(al2);//取交集存放在al1中
		al1.removeAll(al2);//去掉al1中与al2相同的部分后赋给al1
		
		sop("al1:"+al1);
		sop("al2:"+al2);
	}
}
























