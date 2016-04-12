package ThreadAgain;
class MyLock{
	static Object locka = new Object();
	static Object lockb = new Object();
}

class Test11 implements Runnable{
	private boolean flag;
	Test11(boolean flag)
	{
		this.flag = flag;
	}
	public void run(){
		if(flag){
			synchronized(MyLock.locka){
				System.out.println("if locka  ");
				synchronized(MyLock.lockb){
					System.out.println("if lockb  ");
				}
			}
			
		}else{
			
			synchronized(MyLock.lockb){
				
				System.out.println("else lockb");
				synchronized(MyLock.locka){
					System.out.println("else locka");
				}
			}
			
		}
	}
}
public class ThreadDemo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Test11(true));
		Thread t2 = new Thread(new Test11(false));
		
		t1.start();
		t2.start();	
	}
}
