package oop;
//子父类中的构造函数
/**
 * 在对子类对象进行初始化时，父类构造函数也会运行，
 * 那是因为子类构造函数默认第一行有一条隐式的语句super();
 * super():会访问父类中的空参构造函数
 * 
 * 为什么子类一定要访问父类中的构造函数
 */
public class ExtendsDemo01 {
	public static void main(String[] args){
		Zii z = new Zii(4);
	}
}

class Fuu{
	Fuu(){
		System.out.println("fu run...");
	}
	Fuu(int x){
		System.out.println("fu"+x);
	}
}
class Zii extends Fuu{
	Zii(){
		//super();父类构造函数
		System.out.println("zi run...");
	}
	Zii(int x){
		super();
		System.out.println("zi..."+x);
	}
}