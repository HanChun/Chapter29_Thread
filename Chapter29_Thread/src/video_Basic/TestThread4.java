/*
 * 关闭线程比较好的方式
 * run()方法结束，线程就结束了
 */
package video_Basic;

public class TestThread4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner4 r = new Runner4();
		Thread t = new Thread(r);
		t.start();
		for(int i=0 ; i<100000 ; i++){
			if(i%10000==0 & i>0){
				System.out.println("Thread main is over");
			}
		}
		r.shutDown();
	}

}
class Runner4 implements Runnable{
	private boolean flag = true ;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(true){
			System.out.println(" " + i++);
		}
	}
	
	public void shutDown(){
		flag = false;
	}
}

