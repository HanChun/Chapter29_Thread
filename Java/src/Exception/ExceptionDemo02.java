package Exception;
/*�Զ����쳣
 * �����ڱ������У����ڳ�����-1��Ҳ��Ϊ��������޷����������
 * ��ô����Ҫ�������������Զ��������
 * 
 * ���ں����ڲ�������throw�׳��쳣������ô�ͱ���Ҫ������Ӧ�Ĵ�����
 * ��������>Ҫô��try catch�д���
 * ��������>�ں�����������try-catch�����ߵ���
 * 
 * ���ִ�ӡ�Ľ����ֻ���쳣�����ƣ�ȴû���쳣����Ϣ��toString�Ǵ�ӡ�쳣����Ϣ�����ƣ�
 * ��ζ����쳣��Ϣ�أ�
 */
class FuShuException extends Exception{
	private String msg ;
	FuShuException(String msg){
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}

class Demo02{
	int div(int a ,int b) throws FuShuException{
		if(b<0)
			throw new FuShuException("�����˳����Ǹ��������");//�ֶ�ͨ��throw�ؼ����׳��Զ����쳣����
		
		return a/b;
	}
}
public class ExceptionDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo02 d = new Demo02();		
		int x;
		try {
			x = d.div(4, -1);
			System.out.println("x=" + x);
		} catch (FuShuException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			System.out.println("�������ָ�����");
		}
			System.out.println("over");
	}
}

/*
 *�������ڵ��ó����쳣��Exceptionʱ��Ҫôtry��Ҫôthrows
 */

/*
 	class Throwable{
	private String message;
	Throwable(String message){
		this.message = message;		
	}
	public String getMessage(){
		return message;
	}
}

class Exception extends Throwable{

	Exception(String message) {
		super(message);
	}
}
//new Exception("haha").getMessage();
*/













