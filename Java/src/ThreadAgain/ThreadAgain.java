package ThreadAgain;
/*
 * ÿ�εĽ������ͬ����Ϊÿ���̶߳���Ŭ����ȡcpu��ʹ��Ȩ��cpu
 * ִ�е�˭��˭�����У���˳��⣻cpu�����ſ��ٵ��л����Դﵽ����ȥ
 * ��ͬʱ���е�Ч����
 * 
 *���ǿ�������İѶ��̵߳�������Ϊ����������ռcpu����Դ��
 *����Ƕ��̵߳�һ�����ԣ�����ԣ�
 *
 *����run������ԭ��
 *Thread�����������߳� :�������ڴ洢Ҫ���еĴ��� ���ô洢���ܾ���run����
 */
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
		d.run();//ʹ���߳̿�ʼִ�У�������run()����
		
		for(int x=0 ; x<60 ; x++)
			System.out.println("Hello world"+x);
	}

}
