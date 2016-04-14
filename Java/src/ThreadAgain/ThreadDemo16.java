package ThreadAgain;
/*
 * ������������̴߳��ڶ���״̬����Ͷ���������ˣ��߳̾Ͳ������
 * interrupt()�������ǽ����̣߳�����ʹ����wait(),sleep()�ȶ���״̬�е��̣߳�
 * ǿ�ƻָ�������״̬�������������У�
 * 
 * ��û��ָ���ķ�ʽ�ö�����ָ̻߳�������״̬ʱ����ʱ��Ҫ�Զ�����������
 * ǿ�����ָ̻߳�������״̬�����������Ϳ��Բ���������߳̽�����
 */
class StopThread16 implements Runnable{
	private boolean flag = true;
	public synchronized void run() {
		while(flag){
			try { 
				wait();//����״̬ǿ�Ʊ�������ͷ������쳣
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block 
				e.printStackTrace();
				System.out.println(Thread.currentThread().getName() +"...Exception");
				flag = false;
			}
			System.out.println(Thread.currentThread().getName() + "...run");
		}	
	}
	public void changeFlag(){
		flag = false;
	}
} 

public class ThreadDemo16 {
	public static void main(String[] args){
		StopThread16 st = new StopThread16();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		t1.setDaemon(true);
		t2.setDaemon(true);//������ǰ̨�̣߳�ǰ̨�߳�ֹͣ�ˣ�����Ҳֹͣ��
		t1.start();
		t2.start();
		
		int num = 0;
		while(true){
			if(num++==60){
				st.changeFlag();
				t1.interrupt();
				t2.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"..." +num);
		}
	}
}
//Thread��toString������������߳�����+���ȼ�+�����߳���
//�����̰߳������̣߳�Ĭ�����ȼ���5
//t1.setPriority(Thread.MAX_PRIORITY)
//Thread.yield();�ͷŵ�ǰ�̵߳�ִ��Ȩ
