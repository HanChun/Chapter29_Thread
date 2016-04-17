package Collection;

import java.util.ArrayList;
import java.util.Iterator;

/*���Զ��������ΪԪ�ش浽ArrayList�����У���ȥ���ظ�Ԫ��
 *���磺���˶���ͬ������ͬ������Ϊͬһ���ˣ�Ϊ�ظ�Ԫ��
 * 
 * List�����ж�Ԫ���Ƿ���ͬ�����ݵ���Ԫ�ص�equals����
 * 		ͬ����remove�����õ�Ҳ��equals
 */
class Person{//person�Դ�equals�������̳���object
	private String name;
	private int age;
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public boolean equals (Object obj){
		System.out.println();
		if(!(obj instanceof Person))
			return false;
		Person p = (Person)obj;
		System.out.println(this.name+"..."+p.name);
		
		return this.name.equals(p.name) && this.age==p.age;
		
	}
}

public class CollectionDemo09 {
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static ArrayList singleElement(ArrayList al){
		ArrayList newAl = new ArrayList();
		Iterator it = al.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if(!newAl.contains(obj)){//���������õ�equals����
				newAl.add(obj);
			}
		}
		return newAl;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(new Person("lisi01",30));//al.add(Object obj); // Object obj = new Person("lisi01",30);
		al.add(new Person("lisi02",32));
		al.add(new Person("lisi03",34));
		al.add(new Person("lisi04",30));
		al.add(new Person("lisi02",32));
		
		al = singleElement(al);
		
		Iterator it = al.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			Person p = (Person)obj;
			sop(p.getName()+"::"+p.getAge());
		}
	}

}



















