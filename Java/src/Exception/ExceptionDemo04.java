package Exception;

/*
 * 防止NullPointerException
 * 
 * 关于RuntimeException;
 * 自定义异常时，如果该异常发生时，就无法继续进行运算，就让自定义异常继承RuntimeException;
 * 
 * 对于异常分为两种：
 * 1、编译时被检测的异常
 * 2、编译时不被检测的异常（运行时异常，RuntimeException以及其子类）
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
			throw new FuShuException1("出现了除数为负");
		if(b==0)
			throw new ArithmeticException("被零除了");
		return a/b;
	}
}


class Person{
	public void checkName(String name){
		//if(name.equals("lisi"))//NullPointerException
		if("lisi".equals(name))//if(name!=null && name.equals("lisi"))左面是假
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
