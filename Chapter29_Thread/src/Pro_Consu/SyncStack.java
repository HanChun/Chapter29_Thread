package Pro_Consu;

public class SyncStack {
	int index = 0 ;
	Food[] arrFood = new Food[6];
	
	public synchronized void push(Food food){
		while( index == arrFood.length ){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	//wait()是object类里面的方法，所以this指的是SyncStack
				//wait()时锁不见了
		}
		this.notify();//叫醒一个正在在当前对象上等待的线程
		arrFood[index] = food;
		index++;
	}
	
	public synchronized Food pop(){
		while(index == 0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		return arrFood[index];
	}
}
