package oop;
/**����һ�������ͻص�����֮��Ӧ�Ĺ��캯��
 * ���캯��������Ҫ���巵��ֵ���ͣ�
 * 
 * ���캯�������ã���������г�ʼ����
 * Ҳ����˵�����ڶ��ڴ��в��������ʱ�򣬶�����Ҫһ����ʼ��������
 * 
 * ��һ������û�ж��幹�캯��ʱ��ϵͳ��Ĭ�ϸ��������һ���ղ����Ĺ��캯����
 * ���������Զ����˹��캯����Ĭ�ϵĹ��캯����û���ˣ�
 * 
 * һ�����п��Զ��������캯�����Ŷ�����캯��������ͬ
 * ���أ���������ͬ�������б�ͬ
 * 
 * ���캯����һ�㺯����д�����в�ͬ
 * ���캯�����ڶ���һ���������У��������ʼ����
 * 
 * ��һ�㷽���Ƕ�����ò�ִ�У��Ǹ�������Ӷ���߱��Ĺ��ܣ�
 * 
 * һ�������������캯��ֻ����һ�Σ���һ�㷽�����Ա��ö�����ö�Σ�
 */

class Person{
	private String name;
	private int age;
	
	/*��������
	 * ���ã���������г�ʼ��
	 * ����һ���������У����������ڹ��캯��ִ�У�
	 * ���������Ǹ����ж������ͳһ��ʼ��
	 * �����캯���Ǹ���Ӧ�Ķ����ʼ��
	 * 
	 * ���������ж�����ǲ�ͬ�����Եĳ�ʼ�����ݣ�
	 */
	
	{
		System.out.println();
	}
	
	//Person(){};  ���Լ���д��ϵͳ���Զ�����һ��
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
		
		//����һ������ȷ�ϵ����ĸ����캯��
		Person p1= new Person();
		Person p2= new Person("lisi");
		Person p3 =new Person("wangwu",10);
	}

}
