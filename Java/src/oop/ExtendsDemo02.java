package oop;
//�����Ȼ���ʵ������еĹ��캯��
class F{
	F(int x){
		System.out.println("fu run..."+ x);
	}
}
class Z extends F{
	Z(){
		super(4);//���ڸ���Ĺ��췽���Ǵ������ģ�����̳�Ĭ�Ϲ���������super()���������У�Ҫ���super(����)
		System.out.println("zi....");
	}
	Z(int x){
		super(3);
		System.out.println("zi..."+x);
	}
}


public class ExtendsDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z = new Z(1);

	}
}
