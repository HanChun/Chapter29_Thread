package Pro_Consu;

public class Consumer implements Runnable {
	SyncStack ss = null;
	Consumer(SyncStack ss){
		this.ss= ss;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<20 ; i++){
			Food fd = ss.pop();
			System.out.println("消费了一个"+fd);
		}		
		try {
			Thread.sleep((int)(Math.random())*1000 );
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
