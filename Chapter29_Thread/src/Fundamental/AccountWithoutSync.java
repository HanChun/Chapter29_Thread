package Fundamental;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithoutSync {
	private static Account account = new Account();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newCachedThreadPool();		
		for(int i = 0 ; i<100 ; i++){
			executor.execute(new AddAPennyTask());
		}
		
		executor.shutdown();
		
		/*Boolean flag = executor.isTerminated();		
		 *while(!flag){System.out.println("no...");}
		 *��ôд�Ǵ�ģ�һ��û�н����ͽ���ѭ������Ļ�����ô����Զ������������
		 *�䲻���ܷ�����һ����flag���¸�ֵ������
		 *����Ҫ��ͣ���ж�isTerminated() 
		 *��������������ѭ��
		 */	
		
		while(!executor.isTerminated()){}
		
				
		System.out.println("what's balance ?  "+ account.getBalance());		
	}
	
	
	
	private static class AddAPennyTask implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			account.deposit(1);
			
		}
	}
	
	
	private static class Account{
		private int balance = 0;		
		public int getBalance(){
			return balance;
		}		
		public void deposit(int amount){
			balance = balance + amount ;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 		
	}
}
