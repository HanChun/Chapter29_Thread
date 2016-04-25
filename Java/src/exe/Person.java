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
	//重点
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(!(obj instanceof Person)){
			throw new ClassCastException("类型错误"); 
		}
		Person p = (Person)obj;
		return this.name==p.name && this.age==p.age ;
		
	}
}









