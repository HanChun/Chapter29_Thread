package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student implements Comparable<Student>{
	private String name;
	private int age;
	Student(String name, int age){
		this.age = age;
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return name +":"+age;
	}
	public int hashCode(){
		return name.hashCode()+age*34;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Student))
			throw new ClassCastException("¿‡–Õ≤ª∆•≈‰");
			
		Student s = (Student)obj;
		return this.name.equals(s.name) && this.age==s.age;
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		int num = new Integer(this.age).compareTo(new Integer(s.age));
		if(num==0)
			return this.name.compareTo(s.name);
		return num;	
	}	
}



public class MapDemo03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student,String> hm = new HashMap<Student,String>();
		
		hm.put(new Student("lisi1",21), "beijing");
		hm.put(new Student("lisi2",22), "shanghai");
		hm.put(new Student("lisi3",23), "nanjing");
		hm.put(new Student("lisi4",24), "wuhan");
		
		Set<Student> keySet = hm.keySet();
		Iterator<Student> it = keySet.iterator();
		while(it.hasNext()){
			Student stu = it.next();
			String addr = hm.get(stu);
			System.out.println(stu +".."+addr);
		}
		
		Set<Map.Entry<Student, String>> entrySet = hm.entrySet();
		Iterator<Map.Entry<Student, String>> it1 = entrySet.iterator();
		while(it1.hasNext()){
			Map.Entry<Student, String> me = it1.next();
			Student stu = me.getKey();
			String addr = me.getValue();
		}
	}
}






















