package Exception;
/*异常：就是程序在运行时出现的不正常的情况
 *异常的由来：问题也是现实生活中一个具体的事物 ，可以通过java的形式进行描述；并封装成对象；
 *对于问题的划分：两种；
 *一种是严重的，一种是非严重的
 *对于严重的问题，java通过Error类来进行描述；
 *	对于Error一般不编写针对性的代码对其进行处理；//这部分是虚拟机告诉你的
 *对于非严重的，java通过Exception来描述；
 *	对于Exception可以使用针对性的处理方式进行处理
 *
 *Throwable
 *		|--Error
 *		|--Exception
 *
 *2、异常的处理
 *
 *3、对捕获到的异常进行常见方法操作
 *		String getMessage():获取异常的信息
 */
class Demo{
 	int div(int a, int b) throws Exception//在功能上通过throws的关键字声明了该功能有可能会出现问题
 								//这是标记，是编写功能的人标记一下此功能，告诉使用者，我这个功能会有问题，
 								//你使用的时候要处理一下,你若不处理，你就编译失败
 	 {
		return a/b;
	}
}
public class ExceptionDemo {
	public static void main(String[] args)throws Exception {//这么抛出是抛出给虚拟机了
		
		Demo d = new Demo();
		/*try {
			int x = d.div(4, 0);
			System.out.println("x=" +x);
		} catch (Exception e) {	//Exception e = new ArithmeticException();//在功能中它抛什么你处理什么
			System.out.println("除零啦");
			System.out.println(e.getMessage());// by zero
			System.out.println(e.toString());
			e.printStackTrace(); //异常信息 异常名称 异常出现的位置
			//其实jvm默认的异常处理机制，就是在调用printStrackTrace方法
		}
*/		
		int x = d.div(4, 0);
		System.out.println("x=" +x);
		
		System.out.println("over");
	}
}



















