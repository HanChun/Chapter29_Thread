package Collection;

import java.util.LinkedList;

/*ģ����л��Ƕ�ջ
 * 
 * ʹ��LinkedListģ���ջ���Ƕ��е����ݽṹ
 * ��ջ���Ƚ����     e.g.��ͬһ������
 * ���У��Ƚ��ȳ�     First in First out ;  FIFO  e.g.��ͬһ��ˮ��
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
