package Collection;

import java.util.LinkedList;

/*LinkedList:���з���
 * addFirst();
 * addLast();
 * 
 * getFirst();
 * getLast();
 * 
 * removeFirst();
 * removeLast();
 * 
 * NoSuchElementException û�����Ԫ���쳣�������Ϸ���ʱ��
 * 
 * ���������ˣ�
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
		link.addFirst("java04");//��ͣ�طŵ���һ��λ��
		
	/*	sop(link);
		
		sop(link.getFirst());
		sop(link.getLast());
		
		sop(link.removeFirst());//��ȡ��Ԫ�أ���ɾ����Ԫ��		
	 */		
		while(!link.isEmpty()){
			sop(link.removeFirst());
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
