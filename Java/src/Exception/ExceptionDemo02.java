package Exception;
/*自定义异常
 * 需求：在本程序中，对于除数是-1，也视为错误的是无法进行运算的
 * 那么就需要对这个问题进行自定义的描述
 * 
 * 当在函数内部出现了throw抛出异常对象那么就必须要给出对应的处理动作
 * ————>要么在try catch中处理
 * ————>在函数上声明让try-catch调用者调用
 * 
 * 发现打印的结果中只有异常的名称，却没有异常的信息（toString是打印异常的信息和名称）
 * 如何定义异常信息呢？
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
			throw new FuShuException("出现了除数是负数的情况");//手动通过throw关键字抛出自定义异常对象
		
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
			System.out.println("除数出现负数了");
		}
			System.out.println("over");
	}
}

/*
 *主函数在调用出现异常的Exception时，要么try，要么throws
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













