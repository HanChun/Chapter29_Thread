package oop;
/**
 * 静态代码块，随着类的加载而执行，只执行一次；
 * 用于给类进行初始化，
 *
 */
//  最终输出结果：b,c,a
public class DemoStatic {
	static{
		System.out.println('b');
	}

	public static void main(String[] args) {
		// 只打印出一个a
		new Personb() ;
		new Personb() ;

	}
	static {
		System.out.println('c');
	}

}
class Personb{
	static{
		System.out.println("a");
	}
	
	
	String name;
	String country ="CN";
	public void show(){
		System.out.println();
	}
}
