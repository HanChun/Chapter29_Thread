package oop;
/* 静态代码块给类初始化的；
 * 构造代码块给对象初始化的；
 * 构造函数，给对应对象初始化
 */
public class DemoStatic03 {

	public static void main(String[] args) {
		new StaticE(4);//  a c d
	}
}

class StaticE{	
	int num= 9;
	StaticE(){
		System.out.println("b");
	}
	static{
		System.out.println("a");
	}
	{
		System.out.println("c");
	}
	StaticE(int x){
		System.out.println("d");
	}
	public static void show(){
		System.out.println("show run");
	}
}