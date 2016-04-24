package Reflect;

import java.lang.reflect.Constructor;

class Emp{
	private String name;
	private int age;
	private Emp(){}
	Emp(String name){}
	public Emp(String name ,int age){}
}
public class Demo05 {

	public static void main(String[] args) throws Exception {
		Class<Emp> c = Emp.class;
		Constructor[] con= c.getConstructors();//获取的是public的
		for(Constructor cons : con){
			System.out.println("c.getConstructors()  "+cons);
		}
		
		Constructor c1 =c.getConstructor(String.class,int.class);
		System.out.println(c1);
		
		System.out.println("==============================");
		con = c.getDeclaredConstructors();
		for(Constructor cons:con){
			System.out.println(cons);
		}
		
	}

}
