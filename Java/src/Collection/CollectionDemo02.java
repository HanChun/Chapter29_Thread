package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



/*Collection
 * 		|---List Ԫ��������ģ�Ԫ������������Ϊ�ü�����������
 * 		|---Set	  Ԫ��������ģ�Ԫ�ز������ظ�
 * 
 * List�����з��������ǿ��Բ����Ǳ�ķ������Ǹ���ϵ���еķ���
 * ����add(index,element);addAll(index,Collection)
 * ɾ��remove(index) 
 * �ģ�set(index,element)
 * �飺get(index);sublist(from,to);listIterator()
 * 
 * List�������еĵ�������ListIterator��Iterator���ӽӿ� 
 * �ڵ���ʱ��������ͨ�����϶���ķ������������е�Ԫ�أ���Ϊ�ᷢ�������޸��쳣��
 * 
 */
public class CollectionDemo02 {
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void method(){
		ArrayList al = new ArrayList();
		//���Ԫ��
		al.add("java01");
		al.add("java02");
		al.add("java03");
		
		sop("ԭ�����ǣ�" + al);
		
		//��ָ��λ�����Ԫ��	
		al.add(1,"java09");
		
		//ɾ��ָ��λ�õ�Ԫ��
		al.remove(2);
		
		//�޸�Ԫ��
		al.set(2, "java007");
		
		//ͨ���Ǳ��ȡԪ��
		sop("get(1):"+al.get(1));
		
		//��ȡ����Ԫ��
		for(int x=0 ; x<al.size() ; x++){
			System.out.println("al("+x+")=" +al.get(x) );
		}
		
		Iterator it = al.iterator();
		while(it.hasNext()){
			sop("next: "+it.next());
		}
		
		//ͨ��indexOf��ȡ�����λ��
		sop("index= "+ al.indexOf("java02"));
		
		List sub = al.subList(1, 3);//ȡ���б�����1��������3
		sop("sub="+sub);
		
	}
	public static void main(String[] args) {
		//��ʾ�б������
		ArrayList al = new ArrayList();
		//���Ԫ��
		al.add("java01");
		al.add("java02");
		al.add("java03");
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Object obj = it.next(); 
			if(obj.equals("java02"))
				//al.add("java008");���������޸��쳣��
				//������ͬ���ַ�ʽ��һ�ֵ�������һ�����飬ȥͬʱ�޸��쳣��
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




























