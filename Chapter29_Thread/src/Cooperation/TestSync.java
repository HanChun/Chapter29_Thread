package Cooperation;

public class TestSync implements Runnable {
	Timer timer = new Timer();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSync test = new TestSync();//ջ������һ��С��test����ָ����ڴ��е�test����
		
		Thread t1 = new Thread(test);//��ʱ���������߳�ͬʱ����timer��Ķ���
		Thread t2 = new Thread(test);
		 
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		timer.add(Thread.currentThread().getName());
		//�ѵ�ǰ�̵߳����ָ�ֵ��timer
	}
}

class Timer{
	private static int num = 0;
	public synchronized void add(String name){//ִ�з����Ĺ��̵��У���ǰ��������
		//synchronized(this){
			num++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + ",���ǵ�" + num +"��ʹ��timer���߳�");
		//}
	}
}














