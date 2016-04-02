package oop;
/**
 * ���ģʽ����23�֣�GOF
 * ����ģʽ�����һ�������ڴ���ֻ����һ������
 * ��Ҫ��֤����Ψһ��
 * 1��Ϊ�˱�������������ཨ����������ֽ�ֹ�����������������
 * -------���캯��˽�л�
 * 2����Ϊ��������������Է��ʵ��������ֻ���ڱ������Զ������
 * -------�����д���һ���������
 * 3��Ϊ�˷�������������Զ������ķ��ʣ������ṩһЩ���ʷ�ʽ
 * -------�ṩһ���������Ի�ȡ���ö���
 */

//�ȳ�ʼ�������Ϊ����ʽ
class Single{
	private Single(){}
	private static Single s = new Single();
	public static Single getInstance(){//�ܱ��������÷������뾲̬
		return s;
	}
}


public class SingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single ss= Single.getInstance();
		Single s1 = Single.getInstance();
	}

}
