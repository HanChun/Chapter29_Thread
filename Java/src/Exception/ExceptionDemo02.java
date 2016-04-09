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
 * 
 * 自定义类必须是自定义类继承Exception；
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
	//在出现异常的时候怎么没有用Throwable呢，其实也是可以的
	//继承Exception原因：异常体系一个特点，因为异常类和异常对象都需要被抛出，
	//这个可抛型是Throwable这个体系中的独有特点。只有这个体系中的类和对象才可以被throws和throw操作；
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
	 * 下面是修正样子
	 */
	int div(int a ,int b) throws FuShuException{
		if(b<0)
			throw new FuShuException("出现了除数是负数的情况",b);//手动通过throw关键字抛出自定义异常对象
		
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
			System.out.println("除数出现负数了"+e.getValue());
			
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

/*throws和throw的区别：
 * throws使用在函数上，throw使用在函数内
 * throws后面跟的是异常类，可以跟多个，用逗号隔开。
 * throw后面跟的是异常对象
 */











