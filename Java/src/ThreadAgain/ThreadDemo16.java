package ThreadAgain;
/*
 * 特殊情况：当线程处于冻结状态，其就读不到标记了，线程就不会结束
 * interrupt()方法不是结束线程，而是使处于wait(),sleep()等冻结状态中的线程，
 * 强制恢复到运行状态中来，继续运行；
 * 
 * 当没有指定的方式让冻结的线程恢复到运行状态时，这时需要对冻结进行清除。
 * 强制让线程恢复到运行状态中来。这样就可以操作标记让线程结束。
 */
class StopThread16 implements Runnable{
	private boolean flag = true;
	public synchronized void run() {
		while(flag){
			try { 
				wait();//冻结状态强制被清除，就发生了异常
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
		t2.setDaemon(true);//依赖于前台线程，前台线程停止了，则其也停止了
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
//Thread中toString方法，输出：线程名称+优先级+所属线程组
//所有线程包括主线程，默认优先级是5
//t1.setPriority(Thread.MAX_PRIORITY)
//Thread.yield();释放当前线程的执行权
