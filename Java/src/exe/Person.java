package exe;

public class Person {
	String name;
	int age ;
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
	//�ص�
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(!(obj instanceof Person)){
			throw new ClassCastException("���ʹ���"); 
		}
		Person p = (Person)obj;
		return this.name==p.name && this.age==p.age ;
		
	}
}









