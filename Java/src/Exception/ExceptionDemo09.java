package Exception;
/*有一个圆形和长方形
 * 都可以获取面积，如果面积出现非法的数值，视为是获取面积出现问题（exception）
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
		//正常流程代码和阅读判断代码结合的太过紧密，不好
		if(len<=0 || wid<=0)
			throw new NoValueException("出现非法值");
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































