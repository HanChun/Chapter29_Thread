package oop;
class Ff{
	int num=8;
	void method1(){
		System.out.println("fu method_1");
	}
	void method2(){
		System.out.println("fu method_2");
	}
	static void method4()
	{
		System.out.println("fu method_4");
	}
}
class Zz extends Ff{
	int num =5;
	void method1(){
		System.out.println("zi method_1");
	}
	void method3(){
		System.out.println("zi method_3");
	}
	static void method4()
	{
		System.out.println("zi method_4");
	}
}
public class DuoTaiDemo02 {
	public static void main(String[] args){
		Zz z = new Zz();
		z.method1();
		z.method2();
		z.method3();
		 
		Ff f = new Zz();
		System.out.println(f.num); //8
		Zz zd = new Zz();
		System.out.println(zd.num);//5
		
		f.method1();//zi 一
		f.method2();//fu 二
		//f.method3();//编译失败，说找不到method3方法
		
		Ff ff = new Zz();
		ff.method4();//Ff的
		
	}
}
/*在多态中[非静态的 成员函数]的特点：
*在编译时期：参阅引用型变量所属的类中是否有调用的方法。有，通过；
*在运行时期：参阅对象所属的类中是否有调用的方法。
*简单总结就是：成员函数是在多态调用时，编译看左边，运行看右边；
*（子类有的用自己的，子类没有的访问父类）
*
*在多态中[静态成员变量]的特点：
*无论编译和运行，都参考左边（引用型变量所属的类）；--->因为静态方法不需要对象
*
*在多态中[成员变量]的特点：
*无论编译和运行，都参考左边（引用型变量所属的类）；
*/
