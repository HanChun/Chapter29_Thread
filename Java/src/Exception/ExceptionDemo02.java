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
 * 
 * �Զ�����������Զ�����̳�Exception��
 */


/*class FuShuException extends Exception{
	private String msg ;
	FuShuException(String msg){
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
}*/

class FuShuException extends Exception{
	//�ڳ����쳣��ʱ����ôû����Throwable�أ���ʵҲ�ǿ��Ե�
	//�̳�Exceptionԭ���쳣��ϵһ���ص㣬��Ϊ�쳣����쳣������Ҫ���׳���
	//�����������Throwable�����ϵ�еĶ����ص㡣ֻ�������ϵ�е���Ͷ���ſ��Ա�throws��throw������
	private int value;
	FuShuException(){
		super();
	}
	FuShuException(String msg,int value){
		super(msg);
		this.value = value;
	}
	public int getValue(){
		return value;
	}
}

class Demo02{
	/*
	 *  int div(int a,int b){
	 * 		return a/b;
	 * }
	 * ��������������
	 */
	int div(int a ,int b) throws FuShuException{
		if(b<0)
			throw new FuShuException("�����˳����Ǹ��������",b);//�ֶ�ͨ��throw�ؼ����׳��Զ����쳣����
		
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
			System.out.println(e.getMessage());
			System.out.println("�������ָ�����"+e.getValue());
			
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

/*throws��throw������
 * throwsʹ���ں����ϣ�throwʹ���ں�����
 * throws����������쳣�࣬���Ը�������ö��Ÿ�����
 * throw����������쳣����
 */











