package Pro_Consu;

public class Producer implements Runnable {
	SyncStack ss = null;
	Producer(SyncStack ss){
		this.ss = ss;
	}
	@Override
	public void run() {
		for(int i=0 ; i<20 ;i++ ){
			Food fd = new Food(i);
			ss.push(fd);
			System.out.println("生产了一个"+fd);
		}
		try {
			Thread.sleep( (int)(Math.random())*1000 );
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
