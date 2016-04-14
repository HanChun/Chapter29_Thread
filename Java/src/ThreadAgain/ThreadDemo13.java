package ThreadAgain;
/*
 * 等待唤醒机制
 * notifyAll()
 * notify是object类里面的方法
 * wait() notify() notifyAll()这样的方法全部用在同步里面,因为要对持有锁的线程操作
 * 只有在同一个锁上的线程才可以被相互唤醒；
 * 也就是说等待和唤醒必须是同一把锁
 */
class Res13{
	String name;
	String sex;
	boolean flag = false;
}

class Input13 implements Runnable{
	private Res13 r ;
	Input13(Res13 r){
		this.r = r;
	}
	@Override
	public void run() {
		int x=0;
		
		while(true){
			synchronized(r){
				if(r.flag)
					try {
						r.wait();//让持有r这个锁的线程等待
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if(x==0){
					r.name = "mike";
					r.sex = "man......";
				}else{
					r.name = "丽丽";
					r.sex ="女。。。。。";
				}
				x=(x+1)%2;
				r.flag = true;
				r.notify();//叫醒r这个锁上的等待线程
			}
		}		
	}	
}

class Output13 implements Runnable{
	private Res13 r;
	Output13(Res13 r){
		this.r = r;
	}
	@Override
	public void run() {	
		while(true){ 
			synchronized(r){
				if(!r.flag)
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println(r.name + "......" + r.sex );
				r.flag = false;
				r.notify();
			}
		}
	}
}

public class ThreadDemo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Res13 r = new Res13();
		Input13 in = new Input13(r);
		Output13 out = new Output13(r);
		
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		
		t1.start();
		t2.start();
	}
}
















































