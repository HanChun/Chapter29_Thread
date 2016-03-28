package video_Basic;
/**
 * 同样一个任务对象可以取两线程
 */
public class TestThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner2  r = new Runner2();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

	class Runner2 implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0; i<30 ; i++){
				System.out.println("No." + i);
		}
	}
}