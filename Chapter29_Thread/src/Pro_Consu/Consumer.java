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
			System.out.println(fd);
		}
	}
}
