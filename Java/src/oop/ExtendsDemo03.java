package oop;
/**
 * �����super()���Ҳ����д�����๹�캯���ĵ�һ�У���Ϊ�������ȥ�����ʼ����
 * Ȼ��������ܳ�ʼ���Լ���
 * 
 * ���������еĹ��캯����Ĭ�϶�����ʸ����еĿղι��캯����
 * ��Ϊ�����ÿһ�����캯���ڵĵ�һ�ж���һ����ʽ��super();
 * 
 * ��������û�пղ����Ĺ��캯��ʱ����������ֶ�ͨ��super����this�����ʽ
 * ָ��Ҫ���ʵĹ��캯��
 * ��Ȼ������Ĺ��캯����һ��Ҳ�����ֶ�ָ��this��������ʱ����еĹ��캯���ģ�
 * ���������ٻ���һ�����캯�������������ٻ���һ�����캯������ʸ����еĹ��캯��
 *
 */

//this,super����ͬʱд�ڵ�һ�У�����ߣ���Ҫ��д�ڵ�һ�У�����Ϊ��ʼ������Ҫ����
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
