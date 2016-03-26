package Fundamental;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	  //ExecutorService executor = Executors.newFixedThreadPool(3);
	  //ExecutorService executor = Executors.newFixedThreadPool(1);
		ExecutorService executor = Executors.newCachedThreadPool();
		  
		executor.execute(new PrintChar('a',10));
		executor.execute(new PrintChar('b',10));
		executor.execute(new PrintChar('c',10));
		
		executor.shutdown();//�ر�ִ�����������������������һ���رգ��Ͳ��ܽ����µ�����
	}
}

		class PrintChar implements Runnable{
			private char charToPrint;
			private int times;
			
			public PrintChar(char c, int t){
				charToPrint = c;
				times = t;
			}
		
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i<times ; i++){
					System.out.print(charToPrint);
				}
			}		
		}
