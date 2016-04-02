package oop;

public class StaticDemo04 {

	public static void main(String[] args) {
		P p =new P("zhangsan",20);
		/**
		 * 1、因为new用到了person.class文件，所以会先找到Person.class文件并加载到内存；
		 * 2、执行该类中的静态代码块，如果有的话，给Person.class类进行初始化
		 * 3、在堆内存中开辟空间，分配内存地址
		 * 4、在堆内存中建立对象的特有属性，并进行默认初始化
		 * 5、对属性进行显示初始化
		 * 6、对对象进行构造代码块初始化
		 * 7、对对象进行与之对应的构造函数初始化
		 * 8、将内存地址付给占内存中的p变量
		 */
	}
}

class P{
	private String name="hello";//-----
	private int age;
	
	private static String country ="cn";
	P(String name,int age){
		this.name = name;
		this.age = age;
	}
	{
		System.out.println(name+"..."+age);//-----
	}
	public void setName(String name){
		this.name = name;
	}
	public void speak(){
		System.out.println(this.name +".."+this.age);
	}
	public static void showCountry(){
		System.out.println("country=" + country);
	}
	static{
		System.out.println("hehe");
	}
}
