package StringExe;

public class Student implements Comparable {
	private String name;
	private int age;	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public int compareTo(Object o) {
		if(!(o instanceof Student)){
			throw new ClassCastException("类型错误");
		}
		Student s = (Student)o;
		/*if(this.age> s.age){
			return 1;
		}
		if(this.age < s.age){
			return -1;
		}
		return 0;*/
		return this.age-s.age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
		
		/*if(this == obj)
			return true;		
		if(!(obj instanceof Student)){
			throw new ClassCastException("类型错误");
		}
		Student p = (Student)obj;
		return this.name.equals(p.name) && this.age==p.age;
		*/
		
	}
	

}
