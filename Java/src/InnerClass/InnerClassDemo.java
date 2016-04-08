package InnerClass;
/*内部类的访问规则：
 * 1、内部类可以直接访问外部类中的成员，包括私有；
 * 		之所以可以直接访问外部类中的成员，是因为内部类中持有了一个外部类的引用
 * 2、外部类要访问内部类，【必须】建立内部对象
 * 
 * 3、在外部其它类中，如何直接访问static内部类的非静态成员呢？
 * 		new Outer.Inner().function();
 * 	在外部其它类中，如何直接访问static内部类的static成员呢？
 * 		Outer.Innerrr.func();
 * 
 * 注意：当内部类中定义了静态成员，该内部类必须是静态的
 * 当外部类中的【静态方法】访问内部类时，内部类也必须是静态的
 */
class Outer{
	private int x = 3;
	private static int y =3;
	//内部类 好处：便于class Inner 访问Outer类中的变量
	class Inner{
		//内部类可以被私有修饰，当内部类在外部类的成员的位置上的时候
		int x = 4;//内部成员
		void function(){
			int x = 6 ;//内部局部成员
			System.out.println("Inner : "+x);//---->6
			System.out.println("Inner : "+this.x);//---->4
			System.out.println("Inner : "+ Outer.this.x);//---->5 此处非常重要
		}
	}
	
	private class Innerr{
		//内部类可以被私有修饰，当内部类在外部类的成员的位置上的时候
		void function(){
			System.out.println("Inner : "+x);
		}
	}
	
	static class Innerrr{
		//静态内部类,当内部类被static修饰后，只能直接访问外部类中的static成员
		void function(){
			System.out.println("inner : " + y);
		}
		static void func(){
			System.out.println("inner : " + y);
		}		
	}
	
	class Inner2{
		void show(){
			System.out.println("inner2 show");
		}
	}
	public static void method1(){
		Innerrr.func();
	}
	
	void method(){
		Inner in = new Inner();
		in.function();
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.method();
		
		//新建inner对象时，一定要标识出此inner属于哪一个外部类
		//因为有可能有不同的外部类，同时都有叫作inner的内部类
		Outer.Inner in= new Outer().new Inner();
		in.function();
		
		new Outer.Innerrr().function();//访问静态内部类的方法
		
		Outer.Innerrr.func();//访问静态内部类中的静态方法，连new都不需要！！！
		
	}
}
