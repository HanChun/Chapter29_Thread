package oop;
/**
 * 子类的super()语句也必须写在子类构造函数的第一行，因为你必须先去父类初始化，
 * 然后子类才能初始化自己；
 * 
 * 子类中所有的构造函数，默认都会访问父类中的空参构造函数。
 * 因为子类的每一个构造函数内的第一行都有一句隐式的super();
 * 
 * 当父类中没有空参数的构造函数时，子类必须手动通过super或者this语句形式
 * 指定要访问的构造函数
 * 当然，子类的构造函数第一行也可以手动指定this语句来访问本类中的构造函数的；
 * 子类中至少会有一个构造函数，子类中至少会有一个构造函数会访问父类中的构造函数
 *
 */

//this,super不能同时写在第一行（其二者，都要求写在第一行）；因为初始化动作要先做
class Personn{
	private String name;
	
	Personn(String name){
		this.name =name;
	}
	
	void show(){}
}
class Student extends Personn{

	Student(String name) {
		super(name);
	}
	
	void method(){
		super.show();
	}
}


public class ExtendsDemo03 {

}
