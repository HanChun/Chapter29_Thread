package Cooperation;

public class TestSync implements Runnable {
	Timer timer = new Timer();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSync test = new TestSync();//栈里面有一个小的test，其指向堆内存中的test对象
		
		Thread t1 = new Thread(test);//此时出现两个线程同时访问timer类的对象
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
		//把当前线程的名字赋值给timer
	}
}

class Timer{
	private static int num = 0;
	public synchronized void add(String name){//执行方法的过程当中，当前对象被锁定
		//synchronized(this){
			num++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + ",你是第" + num +"个使用timer的线程");
		//}
	}
}














