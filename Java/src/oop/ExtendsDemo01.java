package oop;
//�Ӹ����еĹ��캯��
/**
 * �ڶ����������г�ʼ��ʱ�����๹�캯��Ҳ�����У�
 * ������Ϊ���๹�캯��Ĭ�ϵ�һ����һ����ʽ�����super();
 * super():����ʸ����еĿղι��캯��
 * 
 * Ϊʲô����һ��Ҫ���ʸ����еĹ��캯��
 */
public class ExtendsDemo01 {
	public static void main(String[] args){
		Zii z = new Zii(4);
	}
}

class Fuu{
	Fuu(){
		System.out.println("fu run...");
	}
	Fuu(int x){
		System.out.println("fu"+x);
	}
}
class Zii extends Fuu{
	Zii(){
		//super();���๹�캯��
		System.out.println("zi run...");
	}
	Zii(int x){
		super();
		System.out.println("zi..."+x);
	}
}