package ThreadAgain;
/*java���ڶ��̵߳İ�ȫ�����ṩ��רҵ�Ľ����ʽ������ͬ������顣
 * synchronized(����){
 * 		��Ҫ��ͬ���Ĵ��룻
 * }
 * 
 * �ô�������˶��̵߳İ�ȫ����
 * �׶ˣ�����̶߳���Ҫ�ж�������Ϊ������Դ
 */
class Ticket04 implements Runnable{
	private int ticket = 100;
	Object obj = new Object();
	public void run(){
		while(true){
			synchronized(obj){
				
				if(ticket>0){
					try {
						Thread.sleep(10);//���쳣�����ף�run()�ǽӿڵ�run()���������ײ���ȥ
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
