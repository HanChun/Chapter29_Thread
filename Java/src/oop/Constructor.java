package oop;
/**对象一建立，就回调用与之对应的构造函数
 * 构造函数，不需要定义返回值类型；
 * 
 * 构造函数的作用：给对象进行初始化；
 * 也就是说，当在堆内存中产生对象的时候，对象需要一个初始化动作；
 * 
 * 当一个类中没有定义构造函数时，系统会默认给该类加入一个空参数的构造函数；
 * 当在类中自定义了构造函数后，默认的构造函数就没有了；
 * 
 * 一个类中可以定义多个构造函数，着多个构造函数名字相同
 * 重载：函数名相同，参数列表不同
 * 
 * 构造函数和一般函数在写法上有不同
 * 构造函数是在对象一建立就运行，给对象初始化；
 * 
 * 而一般方法是对象调用才执行，是给对象添加对象具备的功能；
 * 
 * 一个对象建立，构造函数只运行一次，而一般方法可以被该对象调用多次；
 */

class Person{
	private String name;
	private int age;
	
	/*构造代码块
	 * 作用：给对象进行初始化
	 * 对象一建立就运行，而且优先于构造函数执行；
	 * 构造代码块是给所有对象进行统一初始化
	 * 而构造函数是给对应的对象初始化
	 * 
	 * 构造代码块中定义的是不同对象共性的初始化内容；
	 */
	
	{
		System.out.println();
	}
	
	//Person(){};  若自己不写，系统会自动定义一个
	Person(){
		System.out.println("person run ......");
	}
	
	Person(String name){
		this.name = name;
		System.out.println("name: "+name);
	}
	
	Person(String n,int a){
		name = n;
		age = a;
		System.out.println("name: "+name+"age: "+a);
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Person();
		
		//对象一建立，确认调用哪个构造函数
		Person p1= new Person();
		Person p2= new Person("lisi");
		Person p3 =new Person("wangwu",10);
	}

}
