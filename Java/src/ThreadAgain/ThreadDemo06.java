package ThreadAgain;

/* ͬ�������õ�����һ�����أ�
 * ������Ҫ��������ã�������Ҫ��������ã���ô��������һ��������������ã�����this
 * ����ͬ������ʹ�õ�����this
 * 
 */

class Ticket06 implements Runnable{
	private int tick = 1000;
	Object obj = new Object();
	public  void run() {//���������synchronized�Ļ�����ֻ�����һ���̣߳������ľͽ���������
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
