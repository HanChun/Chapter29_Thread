package Exception;
/*
 * ��ֹNullPointerException
 * 
 * ����RuntimeException;
 * �Զ����쳣ʱ��������쳣����ʱ�����޷������������㣬�����Զ����쳣�̳�RuntimeException;
 */
class FuShuException extends RuntimeException{
	FuShuException(String msg){
		super(msg);
	}
}

class Demo04{
	int div(int a, int b){
		if(b<0)
			throw new FuShuException("�����˳���Ϊ����");
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