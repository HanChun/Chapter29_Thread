package Collection;

import java.util.HashSet;
import java.util.Iterator;

/*
 * |--set�ķ�����ʵ�͸���collection�еķ�����һ����
 * 		|---HashSet:�ײ����ݽṹ�ǹ�ϣ��
 * 		|---TreeSet:
 * ʵ�����ࣺ
 * AbstractSet ,LinkedSet,TreeSet,LinkedHashSet......
 * 
 * ע�⣬�ж�Ԫ���Ƿ���ڣ��Լ�ɾ���Ȳ�������������Ԫ�ص�hashcode��equals����
 */
class Demo{
	public int hashCode(){
		return 60;
	}
}
class Person01{//person�Դ�equals�������̳���object
	private String name;
	private int age;
	Person01(String name,int age){
		this.name = name; 
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int hashCode(){
		System.out.println(this.name+"....hashCode");
		return name.hashCode() +age;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Person01))
			return false;
		Person01 p = (Person01)obj;
		return this.name.equals(p.name)&& this.age ==p.age;
	} 
}
public class SetDemo01 {
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs1 = new HashSet();
		
		hs1.add(new Person("a1",11));
		hs1.add(new Person("a2",12));
		hs1.add(new Person("a3",13));
		hs1.add(new Person("a4",14));
		
		Iterator it1 = hs1.iterator();
		while(it1.hasNext()){
			Person p = (Person)it1.next();
			sop(p.getName() + "::"+p.getAge());
		}
		
/*		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		sop(d1);
		sop(d2);
		HashSet hs = new HashSet();
		sop(hs.add("java01"));//add��������ֵ��boolean��
		hs.add("java01");
		hs.add("java02");
		hs.add("java03");
		
		Iterator it = hs.iterator();
		while(it.hasNext()){
			sop(it.next());
		}
*/
	}
}
