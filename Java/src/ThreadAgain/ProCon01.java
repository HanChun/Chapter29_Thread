package ThreadAgain;
/*
 * JDK1.5中多线程升级解决方案
 * 将同步synchronized替换成了显式的lock操作
 * 将object中的wait，notify，notifyAll 替换成了Condition对象
 * 该对象可以通过Lock锁进行获取；
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource01 {
	private String name; 
	private int count = 1;
	private boolean flag = false;
	
	private Lock lock = new ReentrantLock(); 
	//一个锁上可以有多个相关的condition
	private Condition con_pro = lock.newCondition(); 
	private Condition con_con = lock.newCondition();
	
	public void set(String name) throws InterruptedException{
		lock.lock();			
		try {
			while(flag)
				con_pro.await();
			this.name = name+"--"+count++;
			System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name);
			flag = true;
			con_con.signal();
		} finally {
			lock.unlock();
			//为什么要finally呢，当throw出现异常的时候防止中途断掉，最后一定要放开锁
		}	
	}
	public void out() throws InterruptedException{
		lock.lock();
		try{
			while(!flag)
				con_con.await();
			System.out.println(Thread.currentThread().getName ()+"...消费者..."+this.name);
			flag = false; 
			con_pro.signal();
		}finally{
			lock.unlock();
		}
	}	
}

class Producer01 implements Runnable{
	private Resource01 res;
	Producer01(Resource01 res){
		this.res = res;
	}
	public void run() {
		while(true){
			try {
				res.set("+商品+");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}	
}
class Consumer01 implements Runnable{
	private Resource01 res;
	Consumer01(Resource01 res){
		this.res = res;
	}
	public void run() {
		while(true){
			try {
				res.out();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}	
}

public class ProCon01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource01 r = new Resource01();
		
		Producer01 pro = new Producer01(r);
		Consumer01 con = new Consumer01(r);
		
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(pro);
		Thread t3 = new Thread(con);
		Thread t4 = new Thread(con);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}




 





















