/*
 * ËÀËø
 */
package ThreadAgain;

class Ticket10 implements Runnable{
	private static int tick = 1000;
	boolean flag = true;
	public void run() {
		if(flag){
			while(true){
				synchronized(Ticket10.class){	//class
					show();					//this
				}
			} 
		}else
			while(true)
				show();
}
	
public static synchronized  void show(){	//this
	synchronized(Ticket10.class){		//class
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
}
public class ThreadDemo10 {
	public static void main(String[] args){
		Ticket10 t = new Ticket10();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.flag = false;
		t2.start();	
	}
}

