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
		}
	}
}
