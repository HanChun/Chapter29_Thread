package oop;
/**
 * 1����̬������
 *  	���������ָ�����Լ����������(����˴������չ��)
 * 2����̬��ǰ��
 *  	������������֮���й�ϵ��Ҫô�̳У�Ҫôʵ�֡�
 *  	ͨ������һ��ǰ�ᣬ���Ǵ��ڸ��ǣ�
 * 3����̬�ĺô�
 * 		����˴������չ�ԣ�
 * 4����̬��Ӧ��
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
		System.out.println("�q(�s^�t)�r......");
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
		
		Animal a = new Cat();//��������---->����ת��
		a.eat();
		
		//�����Ҫ����è���еķ���ʱ��Ӧ��ǿ�ƽ���������ã�ת����������ͣ�
		Cat c = (Cat)a;
		c.catchMouse();
		//ǧ��Ҫ���������Ĳ��������ǽ��������ת����������
		//������ת�����Ǹ���Ӧ��ָ���Լ����������ʱ����Ӧ�ÿ��Ա�����
		//��̬��ʼ���ն���������������ű仯
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


