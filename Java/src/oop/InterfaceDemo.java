package oop;

/* �������еķ��������Բ��ֳ��󣬲��ֲ�����
 * 
 * �ӿڣ�������⣬������Ϊ��һ������ĳ����ࣻ
 * ���������еķ������ǳ���ģ���ô�������ͨ���ӿڵ���ʽ����ʾ��
 * 
 * ����ӿڵĸ�ʽ��
 * 1���ӿ��г����Ķ��壺���������󷽷���
 * 2���ӿ��г�Ա���й̶����η�
 * 			������public static final
 * 			������public abstract
 * 
 * �ӿ��еĳ�Ա����public��
 * �������಻�ǣ��������е�Ȩ�޶��ǵ����趨��
 * 
 * �ӿڿ��Ա����ʵ�֣�Ҳ�ǶԶ�̳в�֧�ֵ�ת����ʽ��java֧�ֶ�ʵ�֣�
 */
interface Inter{
	public static final int NUM = 3;//public static final ����ʡ��ϵͳ�Զ�Ĭ��
	public abstract void show();//public abstract ����ʡ..
}
interface InterA{
	 void method();
}

class Test implements Inter,InterA{
	@Override
	public void show() {}
	@Override
	public void method() {}	
}

public class InterfaceDemo {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		System.out.println(t.NUM);	
		System.out.println(Test.NUM);
		System.out.println(Inter.NUM);
	}
}
 