package Reflect;

import java.lang.reflect.Modifier;

class A{}
interface B{}
interface C{}


public class Demo04 extends A implements B,C {
	public class C{}
	public interface D{}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<Demo04> c = Demo04.class;
		System.out.println(c);
		
		System.out.println(c.getPackage());
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getSuperclass().getSimpleName());
		
		System.out.println(c.getInterfaces());
		Class[] arr = c.getInterfaces();
		for(Class cla:arr){
			System.out.println(cla);
		}
		
		int i = c.getModifiers();
		System.out.println(i);//常量值1表示public
		System.out.println(Modifier.toString(i));
	}
}





















