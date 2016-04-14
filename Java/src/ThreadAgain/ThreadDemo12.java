package ThreadAgain;
/*
 *线程间通讯：
 *其实就是多个线程在操作同一个资源，但是操作的动作不同；
 */

//程序问题：当在Input抢占到cpu的执行权的时候，其可能会不停地给res赋值；然后
//Output再抢占资源，不停地输出值，所以会出现一大片一大片的同名的
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
		//出现问题是，当赋值还没有赋值完成的时候，执行权被另外一个线程抢走
		while(true){
			synchronized(r){
					if(x==0){
						r.name = "mike";
						r.sex ="man";
					}  
					else{ 
						r.name ="丽丽"; 
						r.sex ="女女女";
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
