package InnerClass;
/*匿名内部类：
 * 1、匿名内部类其实就是内部类的简写模式
 * 2、定义匿名内部类的前提：
 * 		内部类必须是继承一个类或者实现接口
 */ 
abstract class AbsDemo{
	abstract void show();
}

class Outer2{
	int x = 3;
	class Inner2 extends AbsDemo {      //----->此类无名
		void method(){
			System.out.println("method :" + x);
		}
		@Override
		void show() {
						
		}
	}
	public void function(){
		new Inner2().method();
		new Inner2().show();
		new AbsDemo(){
			@Override
			void show() {
				// TODO Auto-generated method stub
				System.out.println("x="+x);
			}			
		};
	}
	
}


public class InnerClassDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer2().function();
	}

}
