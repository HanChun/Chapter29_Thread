package ThreadAgain;
/*
 *�̼߳�ͨѶ��
 *��ʵ���Ƕ���߳��ڲ���ͬһ����Դ�����ǲ����Ķ�����ͬ��
 */

//�������⣺����Input��ռ��cpu��ִ��Ȩ��ʱ������ܻ᲻ͣ�ظ�res��ֵ��Ȼ��
//Output����ռ��Դ����ͣ�����ֵ�����Ի����һ��Ƭһ��Ƭ��ͬ����
class Res{	
		String name;
		String sex;
}

class Input implements Runnable{
	private Res r;
	Input(Res r){
		this.r = r;
	}
	@Override
	public void run() {
		int x = 0;
		//���������ǣ�����ֵ��û�и�ֵ��ɵ�ʱ��ִ��Ȩ������һ���߳�����
		while(true){
			synchronized(r){
					if(x==0){
						r.name = "mike";
						r.sex ="man";
					}  
					else{ 
						r.name ="����"; 
						r.sex ="ŮŮŮ";
					}
						x=(x+1)%2;
			}
		}		
	}	
}

 
class Output implements Runnable{
	private Res r;
	Output(Res r){
		this.r = r;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			 synchronized(r){
				 System.out.println(r.name +"...."+r.sex);
			 }
		}
	}	
}

public class ThreadDemo12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Res r = new Res();
		Input in = new Input(r);
		Output out  = new Output(r);

		Thread t1 = new Thread(in); 
		Thread t2 = new Thread(out);
		
		t1.start();
		t2.start();
	}
}
