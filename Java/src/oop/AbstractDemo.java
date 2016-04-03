package oop;
/*抽象的使用场景：只抽取功能定义，而不抽取功能主体
 * 抽象方法必须放在，抽象类中； 
 * 
 * 抽象类的特点：
 * 1、抽象方法一定在抽象类中；
 * 2、抽象方法和抽象类都必须被abstract关键字修饰
 * 3、抽象类不可以用new创建对象，因为调用抽象方法没意义；
 * 4、抽象类中的方法要被使用，必须由子类覆写所有的抽象方法后，建立子类对象调用
 * 如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类
 * 
 * 抽象类里面可以不定义抽象方法；
 * 特殊：抽象类中，可以不定义抽象方法，这样做仅仅是不让该类建立对象（java真有这样的）
 */
abstract class BaseStudent{
	abstract void study();
	abstract void study1();
}

class AdvStudent extends BaseStudent{ //即使不写，它也是抽象方法
	void study(){
		System.out.println("base study");
	}

	@Override
	void study1() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
