package oop;
/* ��̬���������ʼ���ģ�
 * ��������������ʼ���ģ�
 * ���캯��������Ӧ�����ʼ��
 */
public class DemoStatic03 {

	public static void main(String[] args) {
		new StaticE(4);//  a c d
	}
}

class StaticE{	
	int num= 9;
	StaticE(){
		System.out.println("b");
	}
	static{
		System.out.println("a");
	}
	{
		System.out.println("c");
	}
	StaticE(int x){
		System.out.println("d");
	}
	public static void show(){
		System.out.println("show run");
	}
}