package ThreadAgain;

class Res14{
	private String name;
	private String sex;
	private boolean flag = false;
	
	public synchronized void set(String name,String sex){
		if(flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.name = name;
		this.sex = sex;
		flag = true;
		this.notify();
	}
	
	public synchronized void out (){
		if(!flag)
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name +"......." +sex );
		flag = false;
		this.notify();
	}
}

class Input14 implements Runnable{ 
	private Res14 r ;
	Input14(Res14 r){
		this.r = r;
	}
	public void run() {
		int x=0;		
		while(true){
			if(x==0){
				r.set("mike", "man");
			}else{
				r.set("丽丽", "女女女女女");
			}
			x = (x+1)%2;
		}		
	}	
}

class Output14 implements Runnable{
	private Res14 r;
	Output14(Res14 r){
		this.r = r;
	}
	@Override
	public void run() {	
		while(true){ 
			r.out();
		}
	}
}
 
public class ThreadDemo14 {
	public static void main(String[] args) {
		Res14 r = new Res14();
		new Thread(new Input14(r)).start();
		new Thread(new Output14(r)).start();
	}
}












