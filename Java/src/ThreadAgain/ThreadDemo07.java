package ThreadAgain;
//ͬ��ǰ�᣺
//1�������������������������߳�
//2����ͬһ����
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
		
		t1.start();//�����������Ǵ�����ʱ״̬����û��ִ��Ȩ��
					//��ʱִ��Ȩ�����߳����У����˲�����������仰ִ���꣬flag���false��
		try {
			Thread.sleep(10);//��ʱ�����߳�ͣһ�£�t1�̲߳�������
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.flag = false;
		t2.start();	
	}
}
