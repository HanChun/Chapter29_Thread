package oop;
/*�����ʹ�ó�����ֻ��ȡ���ܶ��壬������ȡ��������
 * ���󷽷�������ڣ��������У� 
 * 
 * ��������ص㣺
 * 1�����󷽷�һ���ڳ������У�
 * 2�����󷽷��ͳ����඼���뱻abstract�ؼ�������
 * 3�������಻������new����������Ϊ���ó��󷽷�û���壻
 * 4���������еķ���Ҫ��ʹ�ã����������าд���еĳ��󷽷��󣬽�������������
 * �������ֻ�����˲��ֳ��󷽷�����ô�����໹��һ��������
 * 
 * ������������Բ�������󷽷���
 * ���⣺�������У����Բ�������󷽷��������������ǲ��ø��ཨ������java���������ģ�
 */
abstract class BaseStudent{
	abstract void study();
	abstract void study1();
}

class AdvStudent extends BaseStudent{ //��ʹ��д����Ҳ�ǳ��󷽷�
	void study(){
		System.out.println("base study");
	}

	@Override
	void study1() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
