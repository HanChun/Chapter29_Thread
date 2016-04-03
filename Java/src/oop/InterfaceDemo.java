package oop;

/* 抽象类中的方法，可以部分抽象，部分不抽象
 * 
 * 接口：初期理解，可以认为是一个特殊的抽象类；
 * 当抽象类中的方法都是抽象的，那么该类可以通过接口的形式来表示；
 * 
 * 定义接口的格式：
 * 1、接口中常见的定义：常量，抽象方法；
 * 2、接口中成员都有固定修饰符
 * 			常量：public static final
 * 			方法：public abstract
 * 
 * 接口中的成员都是public的
 * 而抽象类不是，抽象类中的权限都是单独设定的
 * 
 * 接口可以被类多实现，也是对多继承不支持的转换形式；java支持多实现；
 */
interface Inter{
	public static final int NUM = 3;//public static final 可以省，系统自动默认
	public abstract void show();//public abstract 可以省..
}
interface InterA{
	 void method();
}

class Test implements Inter,InterA{
	@Override
	public void show() {}
	@Override
	public void method() {}	
}

public class InterfaceDemo {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		System.out.println(t.NUM);	
		System.out.println(Test.NUM);
		System.out.println(Inter.NUM);
	}
}
 