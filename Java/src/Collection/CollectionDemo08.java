package Collection;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * arrayListԪ��ȥ�ظ�
 */
public class CollectionDemo08 {
	public static void sop(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		al.add("java01");
		
		Iterator it = al.iterator();
		while(it.hasNext()){
			sop(it.next()+"..."+it.next());//ע�⣬���ѭ������next��ֻдһ��
		}
		
	/*	sop(al);
		
		al = singleElement(al);
		sop(al);
	*/
	}
	public static ArrayList singleElement(ArrayList al){
		//����һ����ʱ����
		ArrayList newAl = new ArrayList();
		Iterator it = al.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if(!newAl.contains(obj))
				newAl.add(obj);
		}
		return newAl;
	}
}
