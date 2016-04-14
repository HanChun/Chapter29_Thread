package ThreadAgain;
//当某些代码需要同时运行时，就用单独的线程进行封装

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


















