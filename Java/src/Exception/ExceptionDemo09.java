package Exception;
/*��һ��Բ�κͳ�����
 * �����Ի�ȡ��������������ַǷ�����ֵ����Ϊ�ǻ�ȡ����������⣨exception��
 */
class NoValueException extends RuntimeException{
	NoValueException(String message){
		super(message);
	}
}


interface Shape{
	void getArea();
}
class Rec implements Shape{
	private int len,wid; 
	
	Rec(int len , int wid) //throws NoValueException
	{
		//�������̴�����Ķ��жϴ����ϵ�̫�����ܣ�����
		if(len<=0 || wid<=0)
			throw new NoValueException("���ַǷ�ֵ");
		else{
			this.len = len;
			this.wid = wid;
		}
	}
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println(len*wid);
	}	
}

class Circle implements Shape{
	public static final PI = 3.14;
	private int radius;
	Circle(int radius){
		this.radius = radius;
	}
	@Override
	public void getArea() {
		System.out.println(radius*radius* PI);
	}
	
}

public class ExceptionDemo09 {
	public static void main(String[] args) {
		Rec r;		
		r = new Rec(3,4);
		r.getArea();  		
	}
}































