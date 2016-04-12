package ThreadAgain;

class Ticket06 implements Runnable{
	private int tick = 1000;
	Object obj = new Object();
	public void run() {
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

}
