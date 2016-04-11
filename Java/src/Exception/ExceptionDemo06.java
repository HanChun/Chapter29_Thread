package Exception;

class FuShuException06 extends Exception{
	FuShuException06(String msg){
		super(msg);
	}
}

class Demo06{
	int div(int a, int b) throws FuShuException06{
		if(b<0)
			throw new FuShuException06("����Ϊ����");
		return a/b;			
	}
}

public class ExceptionDemo06 {
	public static void main(String[] args) {
		Demo06 d = new Demo06();		
		int x;
		try {
			x = d.div(4,-1);
			System.out.println("x="+x);
		} catch (FuShuException06 e) {
			System.out.println(e.toString());
			//return;//�������쳣��ϣ��������������Խ��������over�Ͳ�ִ����
			System.exit(0);
			//����������£�finally�Ƕ������ģ���Ϊϵͳ������һ����̬��������exit��ϵͳ���˳���jvm����
		}finally{
			System.out.println("fianlly");//finally�д�ŵ���һ���ᱻִ�еĴ���
		}
		 //���ݿ��������һ̨����������Ҳ��cpu��cpu�����������ޣ�������Ҫ�ر�		
		System.out.println("over");
	}
}
