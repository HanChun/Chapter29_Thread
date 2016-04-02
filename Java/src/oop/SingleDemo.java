package oop;
/**
 * 设计模式：共23种；GOF
 * 单例模式：解决一个类在内存中只存在一个对象
 * 想要保证对象唯一：
 * 1、为了避免其他程序过多建立该类对象，现禁止其它程序建立该类对象
 * -------构造函数私有化
 * 2、还为了让其他程序可以访问到该类对象，只好在本类中自定义对象
 * -------在类中传建一个本类对象
 * 3、为了方便其他程序对自定义对象的访问，可以提供一些访问方式
 * -------提供一个方法可以获取到该对象
 */

//先初始化对象成为饿汉式
class Single{
	private Single(){}
	private static Single s = new Single();
	public static Single getInstance(){//能被类名调用方法必须静态
		return s;
	}
}


public class SingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single ss= Single.getInstance();
		Single s1 = Single.getInstance();
	}

}
