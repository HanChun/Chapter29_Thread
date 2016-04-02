package oop;

public class DemoThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("lisi",40);
	}

}
/**
 * 构造函数间的调用，加this
 * this语句用于构造函数间的相互调用
 */

//用于构造函数很多，但就对外暴露一个，而其他的用于自己内部的相互调用；
//this语句只能放在构造函数的第一行
class Persona{
	private String name;
	private int age;
	Persona(){
		
	}
	
	Persona(String name){
		this();
		this.name = name;
	}
	//初始化的动作要先执行，如果初始化中还有初始化的话，那么其仍要先执行；
	Persona(String name,int age){
		this(name);
		this.name = name ;
		this.age = age;
	}
}
