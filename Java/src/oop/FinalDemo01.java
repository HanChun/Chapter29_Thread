package oop;
/*
 * final:最终；
 * 作为一个修饰符
 * 1、可以修饰类，变量，函数；
 * 2、被final修饰的类不可以被继承
 * 3、被final修饰的方法不可以被覆写
 * 4、被final修饰的变量是一个常量，只能被赋值一次，即可以修饰成员变量，又可以修饰局部变量；
 * 5、内部类定义在类中的局部位置上时，只能访问该局部被final修饰的局部变量
 * 继承的弊端，打破了封装性（比如说，有些功能是调用底层的，但是你不知道，你继承了，覆写了，功能就被覆盖了）
 */
class Demo{
	final int x = 3;
	final void show1(){}
	void show2(){
		final int y = 4;
	}
	
}
public class FinalDemo01 {

}
