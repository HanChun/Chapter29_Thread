package oop;
/**
 * ��̬����飬������ļ��ض�ִ�У�ִֻ��һ�Σ�
 * ���ڸ�����г�ʼ����
 *
 */
//  ������������b,c,a
public class DemoStatic {
	static{
		System.out.println('b');
	}

	public static void main(String[] args) {
		// ֻ��ӡ��һ��a
		new Personb() ;
		new Personb() ;

	}
	static {
		System.out.println('c');
	}

}
class Personb{
	static{
		System.out.println("a");
	}
	
	
	String name;
	String country ="CN";
	public void show(){
		System.out.println();
	}
}
