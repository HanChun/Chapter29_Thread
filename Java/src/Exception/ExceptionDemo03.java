package Exception;
/*Exception中有一个特殊的子类异常RuntimeException运行时异常
 * 如果在函数内抛出该异常，函数上可以不用声明，编译一样通过。
 * 如果在函数上声明了该异常，调用者可以不用处理，编译一样通过
 * 
 * 之所以不用在函数上声明，是因为不需要调用者的处理；
 * 就是希望在此runtimeException发生时，程序停止；希望停止程序后，程序员对代码进行修正；
 */
class Demo03{
	int div(int a, int b) throws ArithmeticException{
		/*if (b==0)
			throw new ArithmeticException("被零除了") ;*/
		// throw new Exception;  如果抛它的话函数上必须要声明（正常情况下函数内抛异常函数上都要声明一下）
		return a/b;
	}
}

public class ExceptionDemo03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo03 d = new Demo03();
		
		int x = d.div(4, 0);
		System.out.println("x= " + x );
		
		System.out.println("over");
		
	}
}




