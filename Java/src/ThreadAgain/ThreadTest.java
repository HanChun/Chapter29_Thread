package ThreadAgain;
//��ĳЩ������Ҫͬʱ����ʱ�����õ������߳̽��з�װ

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(){
			public void run(){
				for(int x=0 ; x<100 ; x++){
					System.out.println(Thread.currentThread().getName()+"1...."+x);
				}
			}
		}.start();
				
		for(int x=0 ; x<100 ; x++){
			System.out.println(Thread.currentThread().getName()+"2...."+x);
		}
		
		Runnable r = new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int x=0 ; x<100 ; x++){
					System.out.println(Thread.currentThread().getName()+"3...."+x);
				}		
			}
		};
		new Thread(r).start();
	}
}


















