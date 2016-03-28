package video_Basic;
/**
*线程：线程是一个程序里不同的执行路径
*进程：是一个正在执行中的程序，每一个进程执行都有一个执行顺序，
*	     该顺序就是一个执行路径，执行情景，控制单元；（封装里面的控制单元）
*一个进程中至少有一个线程。
*
*Java VM 启动的时候会有一个进程java.exe. 
*该进程中至少有一个线程负责java程序的执行，而且这个线程运行的代码存在于
*main方法中，该线程称之为主线程；
*其实，jvm启动不止一个线程，还有负责垃圾回收机制的
*
*进程其实是一个静态的概念
*线程，是一个程序里面不同的执行路径
*在同一个时间点上，一个cpu只能支持一个线程执行
*/ 

public class Demo_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.start();
		//这两个交替打印
		for(int i= 0 ; i<60 ;i++)
		System.out.println("Hello world");
		
		Runner1 r = new Runner1();
		Thread t = new Thread(r);//实际中传的是接口的实例对象，所以是父类引用指向子类对象
		t.start();
		//Thread.interrupted();
	}
	
	public static class Runner1 implements Runnable{
		@Override
		public void run() {
			for(int i=0 ; i<100 ; i++){
				System.out.println("Runner1 : " + i);
			}
		}
	}
	
	public static class Demo extends Thread{
		public void run(){
			for(int x=0; x<60 ; x++)
				System.out.println("demo run");
		}	
	}	
}
//能使用接口，就不要从thread类继承
