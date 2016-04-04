package oop;
/**
 * 1、多态的体现
 *  	父类的引用指向了自己的子类对象；(提高了代码的拓展性)
 * 2、多态的前提
 *  	必须是类与类之间有关系。要么继承，要么实现。
 *  	通常还有一个前提，就是存在覆盖；
 * 3、多态的好处
 * 		提高了代码的拓展性；
 * 4、多态的应用
 *
 *
 */
abstract class Animal{
	abstract void eat();
}
class Cat extends Animal{
	void eat() {
		System.out.println("Cat eat......");
	}
	void catchMouse(){
		System.out.println("Catch mouse......");
	}
}
class Pig extends Animal{
	void eat() {
		System.out.println("Pig eat......");
	}
	void sleep(){
		System.out.println("╭(╯^╰)╮......");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("Dog eat......");
	}	
	void kanjia(){
		System.out.println("kanjia......");
	}
}

public class DuoTaiDemo {

	public static void main(String[] args) {
		function(new Cat());
		function(new Dog());
		function(new Pig());
		
		Animal a = new Cat();//类型提升---->向上转型
		a.eat();
		
		//如果想要调用猫特有的方法时，应：强制将父类的引用，转成子类的类型；
		Cat c = (Cat)a;
		c.catchMouse();
		//千万不要出现这样的操作，就是将父类对象转成子类类型
		//我们能转换的是父类应用指向自己的子类对象时，该应用可以被提升
		//多态自始至终都是子类对象在做着变化
	}
	
	public static void function(Animal a ){		
		a.eat();
		if(a instanceof Animal){
			System.out.println("haha");
		}
		if(a instanceof Cat ){
			Cat c = (Cat)a;
			c.catchMouse();
		}
		else if(a instanceof Dog){
			Dog c = (Dog)a;
			c.kanjia();
		}
	}
}


