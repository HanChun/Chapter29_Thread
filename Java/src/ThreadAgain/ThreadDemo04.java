package ThreadAgain;
/*java对于多线程的安全问题提供了专业的解决方式，就是同步代码块。
 * synchronized(对象){
 * 		需要被同步的代码；
 * }
 * 
 * 好处：解决了多线程的安全问题
 * 弊端：多个线程都需要判断锁，较为消耗资源
 */
class Ticket04 implements Runnable{
	private int ticket = 100;
	Object obj = new Object();
	public void run(){
		while(true){
			synchronized(obj){
				
				if(ticket>0){
					try {
						Thread.sleep(10);//此异常不能抛，run()是接口的run()方法，你抛不出去
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"...sale:"+ticket--);
				}				
			}
		}
	}
}
public class ThreadDemo04 {
	public static void main(String[] args){
		Ticket t = new Ticket();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
