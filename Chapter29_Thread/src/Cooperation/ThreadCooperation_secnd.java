package Cooperation;
/*
 * 一个账户加钱
 * 一个账户取钱
 * 不停地价钱和不停地取钱
 * 满足实际条件
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCooperation_secnd {
	private static Account account = new Account();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(2);
		System.out.println("Thread 1\t\tThread 2\t\tBalance");
		
		executor.execute(new DepositTask());
		executor.execute(new WithdrawTask());
		executor.shutdown();
		
		
	}
	
	
	public static class DepositTask implements Runnable{
		public void run(){			
			try {
				while(true){
					account.deposite((int)(Math.random()*10)+1 );
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static class WithdrawTask implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true){
				account.withdraw( (int)(Math.random()*10)+1 );
			}
		}
	}

	private static class Account{
		private static Lock lock = new ReentrantLock();
		private static Condition condition = lock.newCondition();
		private int balance = 0;
		public int getBalance(){
			return balance;
		}
		
		public void withdraw(int amount){
			lock.lock();
			try {
				while(balance < amount){
					System.out.println("\t\tWait for a deposit");
					condition.await();
				}
				balance = balance - amount;
				System.out.println("\t\t\tWithdraw" + amount +"\t\t"+getBalance());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		}
		
		public void deposite(int amount){
			lock.lock();
			try {
				balance = balance +amount;
				System.out.println("Deposite"+amount +"\t\t\t\t\t"+getBalance());
				condition.signalAll();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				lock.unlock();
			}			
		}
	}
}
