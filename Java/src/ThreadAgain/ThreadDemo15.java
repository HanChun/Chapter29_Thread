package ThreadAgain;
/*
 * stop方法已经过时，so如何停止线程呢？
 * 只有一种方法，就是run方法结束；
 * 
 * 开启多线程运行，运行代码通常是循环结构；
 * 只要控制住循环，就可以让run方法over，即线程结束
 */

class StopThread implements Runnable{
	private boolean flag = true;
	public void run() {
		while(flag){
			System.out.println(Thread.currentThread().getName() +"...run");
		}	
	}
	public void changeFlag(){
		flag = false;
	}
} 

public class ThreadDemo15 {
	public static void main(String[] args){
		StopThread st = new StopThread();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		
		t1.start();
		t2.start();
		
		int num = 0;
		while(true){
			if(num++==60){
				st.changeFlag();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"..." +num);
		}
	}
}
