package InnerClass;
/*匿名内部类：
 * 1、匿名内部类其实就是内部类的简写模式
 * 2、定义匿名内部类的前提：
 * 		内部类必须是继承一个类或者实现接口
 * 3、匿名内部类的格式： new父类或者是接口（）{
 * 定义子类的内容}；
 * 4、其实匿名内部类就是一个匿名子类对象，
 * 是把定义类和建立对象封装为一体的表现形式；而且这个对象有点胖；
 * 
 * 匿名内部类的使用，就是简化书写覆盖方法；
 * 5、匿名内部类的方法最好不要超过3个
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
				}
			void abc(){
				System.out.println("haha");
				}
			}.show();
			
		/*new AbsDemo(){
			@Override
			void show() {
				// TODO Auto-generated method stub
				System.out.println("x="+x);
			}			
		};*/
			
			//父类引用指向子类对象，因为你把子类的方法覆写了
			AbsDemo d = new AbsDemo(){
				int num = 9;
				void show() {					
					System.out.println("num==="+num);
				}
				void abc(){
					System.out.println("haha");
				}				
			};
			
			d.show();
			//d.abc();不可以这么写，父类中没有定义过
	}
	
}


public class InnerClassDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer2().function();
	}

}
