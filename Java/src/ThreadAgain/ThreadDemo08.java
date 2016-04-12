package ThreadAgain;
/*如果同步函数被静态修饰后，使用的锁是什么呢；
 * 通过验证，发现不再是this了（静态不可能有对象this啊）
 * 
 * 静态进内存时，内存中没有本类对象，但是一定有该类对应的字节码文件对象；
 * 就是类名.class	
 */
class Ticket08 implements Runnable{
	private static int tick = 100;
	/*不加静态，tick在堆内存中是共享数据，
	 *加了静态，tick在方法区中是共享数据
	 */
	boolean flag = true;
	public void run() {
		if(flag){
			while(true){
				synchronized(Ticket08.class){
					if(tick>0){
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+"...code : " +tick--);
					}
				}
			} 
		}else
			while(true)
				show();
}
	
public static synchronized  void show(){
	//静态进内存的时候没有对象啊，其是由类调用；类进内存的时候的对象，
	//是封装成class类型的对象,就是字节码型的对象
		if(tick>0){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"...show : "+tick--);
		}
	}	
}

public class ThreadDemo08 {
	public static void main(String[] args){
		Ticket08 t = new Ticket08();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.start();//它开启后先是处于临时状态，并没有执行权，
					//此时执行权在主线程手中；其会瞬间把下面的两句话执行完，flag变成false了
		try {
			Thread.sleep(10);//此时让主线程停一下，t1线程才能启动
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.flag = false;
		t2.start();	
	}
}
