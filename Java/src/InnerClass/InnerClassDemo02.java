package InnerClass;
/*一般内部类是不会被共有修饰的
 * 
 * 内部类定义在局部时：
 * 1、不可以被成员修饰符修饰 e.g. static
 * 2、可以直接访问外部类中的成员,因为还持有外部类中的引用。
 * 但是不可以访问它所在的局部中的变量，只能访问被final修饰的局部变量
 * 
 */
class Out{
	int x = 3 ;
	void method(){
		//此时in是局部的类；同时注意，method方法中不能定义static类
		//因为static是成员修饰符
		
		final int y = 4;
		class In{ 
			void function(){
				System.out.println(Out.this.x);
				System.out.println(y);//内部类中要访问局部变量，其值应该访问成final
			}
		}
		new In().function();
	}
	
	void method1(final int a){
		
		class Inn{
			void function()
			{
				System.out.println(a);//这是no的
			}
		}
		new Inn().function();
	}
}

public class InnerClassDemo02 {
	public static void main(String[] args){
		new Out().method();
		new Out().method1(7);
		new Out().method1(8);
		
		Out out = new Out();
		out.method1(7);
		out.method1(8);
	}

}








































