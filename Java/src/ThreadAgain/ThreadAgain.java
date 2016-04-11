package ThreadAgain;
/*
 * 每次的结果都不同，因为每个线程都在努力获取cpu的使用权，cpu
 * 执行到谁，谁就运行；多核除外；cpu在做着快速的切换，以达到看上去
 * 是同时运行的效果；
 * 
 *我们可以形象的把多线程的运行行为看成是在抢占cpu的资源；
 *这就是多线程的一个特性，随机性；
 *
 *覆盖run方法的原因：
 *Thread类用于描述线程 :该类用于存储要运行的代码 ；该存储功能就是run方法
 */
class Demo extends Thread{
	public void run(){
		for(int x=0 ; x<60 ; x++)
			System.out.println("demo run"+x);
	}
}

public class ThreadAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.run();//使该线程开始执行，并调用run()方法
		
		for(int x=0 ; x<60 ; x++)
			System.out.println("Hello world"+x);
	}

}
