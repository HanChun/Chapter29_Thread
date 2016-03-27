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
		 *这么写是错的，一旦没有结束就进入循环里面的话，那么就永远都跳不出来了
		 *其不可能返回上一步给flag重新赋值！！！
		 *你需要不停地判断isTerminated() 
		 *进而帮助你跳出循环
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
