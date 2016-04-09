package Exception;
/*
 * 对多异常的处理
 * 1、声明异常时，建议声明更为具体的异常；这样可以处理的更为具体
 * 2、对方声明几个异常就应该对应几个catch块；不要定义多余的catch块
 * 		但是若catch块中的异常出现继承关系，父类异常catch块放在最下面
 * 
 * 建议在进行catch处理时，catch中一定要定义具体的处理方式，不要简单的定义一句e.printStackTrace()
 * 也不要简单的就书写一条输出语句；
 */
class Demo01{
	int div(int a, int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{
		//两个错误不可能同时出现，函数之中只要有异常发生，函数就结束
		int[] arr = new int[a];
		System.out.println(arr[4]);
		return a/b;
	}
}

public class ExceptionDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo01 d = new Demo01();
		try {
			int x = d.div(4, 0);
			System.out.println("x="+x);
		}catch(Exception e){//--->他全能干的原因是多态性
			//但是这么做并不好，因为如果出现上述功能块以外的问题程序也会继续执行，你并不知道如何继续进行下去；
			//这个时候如果出现对方意料之外的情况，应该把程序停掉；因为我们需要知道，程序到底在哪里卡住了，程序在哪里停住了，我们应该在哪里修正；
			System.out.println("haha......"+e.toString()); 
		} 
		/*catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.toString());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}*/
		
		
		System.out.println("over");
	}

}

/*
 * 真正在异常发生的时候我们是不打印的，而是会用硬盘的文件记录下来；
 * ----->异常日志文件
 */






















