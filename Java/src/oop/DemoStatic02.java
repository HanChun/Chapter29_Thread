package oop;
/*
 * ��ӡ���:
 * a
 * show run
 */
public class DemoStatic02 {

	public static void main(String[] args) {
		// û�ж���
		StaticExe.show();
		StaticExe s = null;//��ʱ��û�м����࣬�����õ����е����ݵ�ʱ����Żᱻ����
	}

}

class StaticExe{
	
	static{
		System.out.println("a");
	}
	public static void show(){
		System.out.println("show run");
	}
}