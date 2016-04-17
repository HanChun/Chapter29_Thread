package Collection;

import java.util.ArrayList;
import java.util.Iterator;

/*将自定义对象做为元素存到ArrayList集合中，并去除重复元素
 *比如：存人对象，同姓名，同年龄视为同一个人，为重复元素
 * 
 * List集合判断元素是否相同，依据的是元素的equals方法
 * 		同样，remove方法用的也是equals
 */
class Person{//person自带equals方法，继承自object
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
			if(!newAl.contains(obj)){//这里面有用到equals方法
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



















