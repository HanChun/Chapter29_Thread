package Exception;

/*
 * ��ֹNullPointerException
 * 
 * ����RuntimeException;
 * �Զ����쳣ʱ��������쳣����ʱ�����޷������������㣬�����Զ����쳣�̳�RuntimeException;
 * 
 * �����쳣��Ϊ���֣�
 * 1������ʱ�������쳣
 * 2������ʱ���������쳣������ʱ�쳣��RuntimeException�Լ������ࣩ
 * 
 */

  class FuShuException1 extends RuntimeException{
 	FuShuException1(String msg){
 		super(msg);
 	}
 }
 

class Demo04{
	int div(int a, int b){	//throws ArithmeticException
		if(b<0)
			throw new FuShuException1("�����˳���Ϊ��");
		if(b==0)
			throw new ArithmeticException("�������");
		return a/b;
	}
}


class Person{
	public void checkName(String name){
		//if(name.equals("lisi"))//NullPointerException
		if("lisi".equals(name))//if(name!=null && name.equals("lisi"))�����Ǽ�
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}

public class ExceptionDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
