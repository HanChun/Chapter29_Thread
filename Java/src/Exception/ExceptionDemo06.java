package Exception;

class FuShuException06 extends Exception{
	FuShuException06(String msg){
		super(msg);
	}
}

class Demo06{
	int div(int a, int b) throws FuShuException06{
		if(b<0)
			throw new FuShuException06("除数为负数");
		return a/b;			
	}
}

public class ExceptionDemo06 {
	public static void main(String[] args) {
		Demo06 d = new Demo06();		
		int x;
		try {
			x = d.div(4,-1);
			System.out.println("x="+x);
		} catch (FuShuException06 e) {
			System.out.println(e.toString());
			//return;//若出现异常，希望程序在这里可以结束；输出over就不执行了
			System.exit(0);
			//在这种情况下，finally是读不到的，因为系统里面有一个静态方法叫作exit，系统，退出，jvm结束
		}finally{
			System.out.println("fianlly");//finally中存放的是一定会被执行的代码
		}
		 //数据库服务器是一台主机，主机也有cpu，cpu处理性能有限，连接完要关闭		
		System.out.println("over");
	}
}
