package Cooperation;

public class Task implements Runnable{
	int b=100;
	public synchronized void m1() throws Exception{
		
		b = 1000;
		Thread.sleep(5000);
		System.out.println("b = " + b);
	}
	
	public void m2(){
		b=2000;
		System.out.println(b);
	}

	@Override
	public void run() {
		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) throws Exception{
		Task task = new Task();
		Thread t = new Thread(task);
		t.start();
		
		Thread.sleep(1000);
		task.m2();
	}
}


















