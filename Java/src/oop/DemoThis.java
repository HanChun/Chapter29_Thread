package oop;

public class DemoThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("lisi",40);
	}

}
/**
 * ���캯����ĵ��ã���this
 * this������ڹ��캯������໥����
 */

//���ڹ��캯���ܶ࣬���Ͷ��Ⱪ¶һ�����������������Լ��ڲ����໥���ã�
//this���ֻ�ܷ��ڹ��캯���ĵ�һ��
class Persona{
	private String name;
	private int age;
	Persona(){
		
	}
	
	Persona(String name){
		this();
		this.name = name;
	}
	//��ʼ���Ķ���Ҫ��ִ�У������ʼ���л��г�ʼ���Ļ�����ô����Ҫ��ִ�У�
	Persona(String name,int age){
		this(name);
		this.name = name ;
		this.age = age;
	}
}
