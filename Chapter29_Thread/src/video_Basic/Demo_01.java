package video_Basic;
/**
*�̣߳��߳���һ�������ﲻͬ��ִ��·��
*���̣���һ������ִ���еĳ���ÿһ������ִ�ж���һ��ִ��˳��
*	     ��˳�����һ��ִ��·����ִ���龰�����Ƶ�Ԫ������װ����Ŀ��Ƶ�Ԫ��
*һ��������������һ���̡߳�
*
*Java VM ������ʱ�����һ������java.exe. 
*�ý�����������һ���̸߳���java�����ִ�У���������߳����еĴ��������
*main�����У����̳߳�֮Ϊ���̣߳�
*��ʵ��jvm������ֹһ���̣߳����и����������ջ��Ƶ�
*
*������ʵ��һ����̬�ĸ���
*�̣߳���һ���������治ͬ��ִ��·��
*��ͬһ��ʱ����ϣ�һ��cpuֻ��֧��һ���߳�ִ��
*/ 

public class Demo_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.start();
		//�����������ӡ
		for(int i= 0 ; i<60 ;i++)
		System.out.println("Hello world");
		
		Runner1 r = new Runner1();
		Thread t = new Thread(r);//ʵ���д����ǽӿڵ�ʵ�����������Ǹ�������ָ���������
		t.start();
		//Thread.interrupted();
	}
	
	public static class Runner1 implements Runnable{
		@Override
		public void run() {
			for(int i=0 ; i<100 ; i++){
				System.out.println("Runner1 : " + i);
			}
		}
	}
	
	public static class Demo extends Thread{
		public void run(){
			for(int x=0; x<60 ; x++)
				System.out.println("demo run");
		}	
	}	
}
//��ʹ�ýӿڣ��Ͳ�Ҫ��thread��̳�
