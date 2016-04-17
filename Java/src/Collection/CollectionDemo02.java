package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



/*Collection
 * 		|---List 元素是有序的，元素有索引。因为该集合体有索引
 * 		|---Set	  元素是无序的，元素不可以重复
 * 
 * List：特有方法。凡是可以操作角标的方法都是该体系特有的方法
 * 增：add(index,element);addAll(index,Collection)
 * 删：remove(index) 
 * 改：set(index,element)
 * 查：get(index);sublist(from,to);listIterator()
 * 
 * List集合特有的迭代器。ListIterator是Iterator的子接口 
 * 在迭代时，不可以通过集合对象的方法操作集合中的元素，因为会发生并发修改异常；
 * 
 */
public class CollectionDemo02 {
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void method(){
		ArrayList al = new ArrayList();
		//添加元素
		al.add("java01");
		al.add("java02");
		al.add("java03");
		
		sop("原集合是：" + al);
		
		//在指定位置添加元素	
		al.add(1,"java09");
		
		//删除指定位置的元素
		al.remove(2);
		
		//修改元素
		al.set(2, "java007");
		
		//通过角标获取元素
		sop("get(1):"+al.get(1));
		
		//获取所有元素
		for(int x=0 ; x<al.size() ; x++){
			System.out.println("al("+x+")=" +al.get(x) );
		}
		
		Iterator it = al.iterator();
		while(it.hasNext()){
			sop("next: "+it.next());
		}
		
		//通过indexOf获取对象的位置
		sop("index= "+ al.indexOf("java02"));
		
		List sub = al.subList(1, 3);//取子列表，包含1，不包含3
		sop("sub="+sub);
		
	}
	public static void main(String[] args) {
		//演示列表迭代器
		ArrayList al = new ArrayList();
		//添加元素
		al.add("java01");
		al.add("java02");
		al.add("java03");
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Object obj = it.next(); 
			if(obj.equals("java02"))
				//al.add("java008");报错：并发修改异常，
				//不能用同两种方式：一种迭代器，一种数组，去同时修改异常；
				it.remove();
			sop(obj);
		}
		sop(al);
		
		ListIterator li = al.listIterator();
		while(li.hasNext()){
			Object obj = li.next();
			if(obj.equals("java02"))
				//li.add("java009");
				li.set("java06");
		}
		
		sop("hasNext():"+li.hasNext());
		sop("hasPrevious():"+li.hasPrevious());		
	}
}




























