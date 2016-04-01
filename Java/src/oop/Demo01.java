package oop;
/*
 * 类class和对象new间的关系
 * 
 * 成员变量：作用于类中
 * 局部变量：作用于函数中或语句中
 * 
 * 在内存中的位置
 * 成员变量：在堆内存中，因为对象的存在，才在内存中存在；----其都有默认值，因为要参与运算
 * 局部变量：存在于栈内存中							-----不初始化是不可能参与运算的
 * 
 * 可以在类中创建主函数，并在主函数中new一个自己，叫在本类中创建本类对象
 */
public class Demo01 {
	public static void main(String[] args) {
		
		Car c = new Car();
		c.num = 5;
		
		//匿名方法
		new Car().num =5;
		new Car().color = "blue";
		new Car().run();
		
		Car q = new Car();
		show(q);
		
		//真正开发的时候想让对象变成垃圾
		//强引用，弱引用，软引用，虚引用；涉及缓存的时候
		q=null;
		
	}
	
	//需求：汽车修配场。对汽车进行修改，将来的车改成黑车，三个轮胎；
	public static void show(Car c){
		c.num = 3;
		c.color ="black";
		c.run();
	}
}

	class Car{
		int num;
		String color;
		void run(){}
	}
