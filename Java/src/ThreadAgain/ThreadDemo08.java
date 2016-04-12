package ThreadAgain;
/*���ͬ����������̬���κ�ʹ�õ�����ʲô�أ�
 * ͨ����֤�����ֲ�����this�ˣ���̬�������ж���this����
 * 
 * ��̬���ڴ�ʱ���ڴ���û�б�����󣬵���һ���и����Ӧ���ֽ����ļ�����
 * ��������.class	
 */
class Ticket08 implements Runnable{
	private static int tick = 100;
	/*���Ӿ�̬��tick�ڶ��ڴ����ǹ������ݣ�
	 *���˾�̬��tick�ڷ��������ǹ�������
	 */
	boolean flag = true;
	public void run() {
		if(flag){
			while(true){
				synchronized(Ticket08.class){
					if(tick>0){
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+"...code : " +tick--);
					}
				}
			} 
		}else
			while(true)
				show();
}
	
public static synchronized  void show(){
	//��̬���ڴ��ʱ��û�ж��󰡣�����������ã�����ڴ��ʱ��Ķ���
	//�Ƿ�װ��class���͵Ķ���,�����ֽ����͵Ķ���
		if(tick>0){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"...show : "+tick--);
		}
	}	
}

public class ThreadDemo08 {
	public static void main(String[] args){
		Ticket08 t = new Ticket08();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.start();//�����������Ǵ�����ʱ״̬����û��ִ��Ȩ��
					//��ʱִ��Ȩ�����߳����У����˲�����������仰ִ���꣬flag���false��
		try {
			Thread.sleep(10);//��ʱ�����߳�ͣһ�£�t1�̲߳�������
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.flag = false;
		t2.start();	
	}
}
