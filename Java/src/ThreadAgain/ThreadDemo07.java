package ThreadAgain;
//同步前提：
//1、必须是两个或是两个以上线程
//2、用同一把锁
//
class Ticket07 implements Runnable{
	private int tick = 100;
	boolean flag = true;
	public void run() {
		if(flag){
			while(true){
				synchronized(this){
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
	
public synchronized  void show(){
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

public class ThreadDemo07 {
	public static void main(String[] args){
		Ticket07 t = new Ticket07();
		
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
