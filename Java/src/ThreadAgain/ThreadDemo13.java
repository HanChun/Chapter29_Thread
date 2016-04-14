package ThreadAgain;
/*
 * �ȴ����ѻ���
 * notifyAll()
 * notify��object������ķ���
 * wait() notify() notifyAll()�����ķ���ȫ������ͬ������,��ΪҪ�Գ��������̲߳���
 * ֻ����ͬһ�����ϵ��̲߳ſ��Ա��໥���ѣ�
 * Ҳ����˵�ȴ��ͻ��ѱ�����ͬһ����
 */
class Res13{
	String name;
	String sex;
	boolean flag = false;
}

class Input13 implements Runnable{
	private Res13 r ;
	Input13(Res13 r){
		this.r = r;
	}
	@Override
	public void run() {
		int x=0;
		
		while(true){
			synchronized(r){
				if(r.flag)
					try {
						r.wait();//�ó���r��������̵߳ȴ�
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if(x==0){
					r.name = "mike";
					r.sex = "man......";
				}else{
					r.name = "����";
					r.sex ="Ů����������";
				}
				x=(x+1)%2;
				r.flag = true;
				r.notify();//����r������ϵĵȴ��߳�
			}
		}		
	}	
}

class Output13 implements Runnable{
	private Res13 r;
	Output13(Res13 r){
		this.r = r;
	}
	@Override
	public void run() {	
		while(true){ 
			synchronized(r){
				if(!r.flag)
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println(r.name + "......" + r.sex );
				r.flag = false;
				r.notify();
			}
		}
	}
}

public class ThreadDemo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Res13 r = new Res13();
		Input13 in = new Input13(r);
		Output13 out = new Output13(r);
		
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		
		t1.start();
		t2.start();
	}
}
















































