package Collection;

import java.util.LinkedList;

/*LinkedList:特有方法
 * addFirst();
 * addLast();
 * 
 * getFirst();
 * getLast();
 * 
 * removeFirst();
 * removeLast();
 * 
 * NoSuchElementException 没有这个元素异常（用以上方法时）
 * 
 * 后期升级了：
 * offerFirst()
 * offerLast()
 * 
 * peekFirst()
 * peekLast()
 * 
 * pollFirst()
 * pollLast()
 * 
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList link  = new LinkedList();
		link.addFirst("java01");
		link.addFirst("java02");
		link.addFirst("java03");
		link.addFirst("java04");//不停地放到第一个位置
		
	/*	sop(link);
		
		sop(link.getFirst());
		sop(link.getLast());
		
		sop(link.removeFirst());//获取了元素，还删除了元素		
	 */		
		while(!link.isEmpty()){
			sop(link.removeFirst());
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
