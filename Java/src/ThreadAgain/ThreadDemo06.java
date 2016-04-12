package ThreadAgain;

/* 同步函数用的是哪一个锁呢：
 * 函数需要被对象调用；函数需要被对象调用，那么函数都有一个所属对象的引用；就是this
 * 所以同步函数使用的锁是this
 * 
 */

class Ticket06 implements Runnable{
	private int tick = 1000;
	Object obj = new Object();
	public  void run() {//如果把其变成synchronized的话，就只会进来一个线程，其他的就进不来的了
		while(true){
			//synchronized(obj){
				show();
			//}
		}
	}
	
	public synchronized void show(){
		if(tick>0){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"...sale : " + tick--);
		}
	}
	
}

public class ThreadDemo06 {
	public static void main(){
		Ticket06 t = new Ticket06();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
