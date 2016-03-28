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
			}	//wait()��object������ķ���������thisָ����SyncStack
				//wait()ʱ��������
		}
		this.notify();//����һ�������ڵ�ǰ�����ϵȴ����߳�
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
