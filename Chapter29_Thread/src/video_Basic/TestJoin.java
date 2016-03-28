package video_Basic;

public class TestJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 t1 = new MyThread2("t1");
		t1.start();
		
		try {
			t1.join();//把t1独立的线程返回到主线程去执行
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1; i<=10; i++){
			System.out.println("i am main thread");
		}
	}
}
class MyThread2 extends Thread{
	MyThread2(String s){
		super(s);
	}
	public void run(){
		for(int i =1 ; i<=10 ; i++){
			System.out.println("I am" +getName());
			  try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}			  
		}
	}
} 