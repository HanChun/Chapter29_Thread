package Collection;
/*1��add�����Ĳ���������object���Ա��ڽ����������͵Ĳ�������
 *2�������д洢�Ķ��Ƕ�������õ�ַ
 *
 *����������ʵ���Ǽ���ȡ��Ԫ�صķ�ʽ��   
 */
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo01 {

	public static void main(String[] args) {
		method_2();
		// ����һ������������ʹ��collection�ӿڵ�����
		ArrayList al = new ArrayList();
		al.add("java01");//add(Object obj)
		al.add("java02");
		al.add("java03");
		al.add("java04");
		
		//��ӡ����
		sop(al);
		
		//���� 
		sop("size:"+al.size());
		
		//ɾ��Ԫ��
		al.remove("java02");  
		sop(al); 
		al.clear();//��ռ���
		
		sop("java03�Ƿ����"+al.contains("java03"));
		sop("�����Ƿ�Ϊ��: "+al.isEmpty());
	}
	public static void method_get(){
		ArrayList al1 = new ArrayList();
		
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");
		
		Iterator it = al1.iterator();//��ȡ������������ȡ�������е�Ԫ��
		
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
		
		al1.retainAll(al2);//ȡ���������al1��
		al1.removeAll(al2);//ȥ��al1����al2��ͬ�Ĳ��ֺ󸳸�al1
		
		sop("al1:"+al1);
		sop("al2:"+al2);
	}
}
























