package ThreadAgain;
class Demo extends Thread{
	public void run(){
		for(int x=0 ; x<60 ; x++)
			System.out.println("demo run"+x);
	}
}

public class ThreadAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.run();//使该线程开始执行，并调用run()方法
		
		for(int x=0 ; x<60 ; x++)
			System.out.println("Hello world"+x);
	}

}
