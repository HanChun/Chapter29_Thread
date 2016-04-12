package ThreadAgain;
/*
 * 需求：银行有一个金库；
 * 有两个储户，分别存300元，每次存100，存3次；
 * 
 * 同步块一定要找准
 */
class Bank{
	private int sum;
	Object obj = new Object();
	public synchronized void add(int n){//把同步作为修饰符放在函数上
		//synchronized(obj)
		//{
				sum = sum +n;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("sum="+sum);
		//}
	}
}

class  Cus implements Runnable{
		private Bank b = new Bank();
		public void run(){
			for(int x=0 ; x<3 ; x++){ 
				b.add(100);
			}
		}
	}


public class ThreadDemo05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cus c = new Cus();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}
