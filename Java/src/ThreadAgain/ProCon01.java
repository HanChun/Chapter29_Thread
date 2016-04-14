package ThreadAgain;
/*
 * JDK1.5�ж��߳������������
 * ��ͬ��synchronized�滻������ʽ��lock����
 * ��object�е�wait��notify��notifyAll �滻����Condition����
 * �ö������ͨ��Lock�����л�ȡ��
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource01 {
	private String name; 
	private int count = 1;
	private boolean flag = false;
	
	private Lock lock = new ReentrantLock(); 
	//һ�����Ͽ����ж����ص�condition
	private Condition con_pro = lock.newCondition(); 
	private Condition con_con = lock.newCondition();
	
	public void set(String name) throws InterruptedException{
		lock.lock();			
		try {
			while(flag)
				con_pro.await();
			this.name = name+"--"+count++;
			System.out.println(Thread.currentThread().getName()+"...������..."+this.name);
			flag = true;
			con_con.signal();
		} finally {
			lock.unlock();
			//ΪʲôҪfinally�أ���throw�����쳣��ʱ���ֹ��;�ϵ������һ��Ҫ�ſ���
		}	
	}
	public void out() throws InterruptedException{
		lock.lock();
		try{
			while(!flag)
				con_con.await();
			System.out.println(Thread.currentThread().getName ()+"...������..."+this.name);
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
				res.set("+��Ʒ+");
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




 





















