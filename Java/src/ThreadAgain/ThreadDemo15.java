package ThreadAgain;
/*
 * stop�����Ѿ���ʱ��so���ֹͣ�߳��أ�
 * ֻ��һ�ַ���������run����������
 * 
 * �������߳����У����д���ͨ����ѭ���ṹ��
 * ֻҪ����סѭ�����Ϳ�����run����over�����߳̽���
 */

class StopThread implements Runnable{
	private boolean flag = true;
	public void run() {
		while(flag){
			System.out.println(Thread.currentThread().getName() +"...run");
		}	
	}
	public void changeFlag(){
		flag = false;
	}
} 

public class ThreadDemo15 {
	public static void main(String[] args){
		StopThread st = new StopThread();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		
		t1.start();
		t2.start();
		
		int num = 0;
		while(true){
			if(num++==60){
				st.changeFlag();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"..." +num);
		}
	}
}
