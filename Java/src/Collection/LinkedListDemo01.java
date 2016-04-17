package Collection;

import java.util.LinkedList;

/*模拟队列或是堆栈
 * 
 * 使用LinkedList模拟堆栈或是队列的数据结构
 * 堆栈：先进后出     e.g.如同一个杯子
 * 队列：先进先出     First in First out ;  FIFO  e.g.如同一个水管
 */
class Queue{
	private LinkedList link;
	Queue(){
		link = new LinkedList();
	}	
	public void myAdd(Object obj){
		link.addFirst(obj);
	}
	public Object myGet(){
		return link.removeLast();
	}
	public boolean isNull(){
		return link.isEmpty();
	}
}

public class LinkedListDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue dl = new Queue();
		dl.myAdd("java01");
		dl.myAdd("java02");
		dl.myAdd("java03");
		dl.myAdd("java04");
		
		while(!dl.isNull()){
			System.out.println(dl.myGet());
		}
	}
}
