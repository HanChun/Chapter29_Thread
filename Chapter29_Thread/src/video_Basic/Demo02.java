package video_Basic;

import java.util.Date;

/*�ر�һ�����̣���ʵ��stop(),interrupt()�������ã�
 * ̫�ֱ�
 */

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		thread.start();
		
		thread.flag = false;
		//thread.interrupt();
	}
}

class MyThread extends Thread{
	boolean flag = true;
	public void run(){
		while (flag){
			System.out.println("===" + new Date() + "===");			
			 try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


