package ThreadAgain;
/*线程的5种状态：1、被创建；2、运行；3、阻塞；4、冻结；5、消亡....
 *  static Thread currentThread() 获取当前线程对象
 *  getName() 获取线程名称；
 */

class Test extends Thread{
	private String name;
	Test(String name){
		//this.name =name;
		super(name);
	}
	public void run(){
		for(int x=0 ; x<60 ; x++){
			System.out.println(name+"..." + this.getName() +" run ..." +x);
			System.out.println(Thread.currentThread().getName() );
			System.out.println(Thread.currentThread()==this);
		}
	}
}

public class ThreadDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test("one");
		Test t2 = new Test("two");
		t1.start();
		t2.start();
		for(int x=0; x<60 ;x++){ 
			System.out.println("main......"+x);
		}
		
	}

}



























