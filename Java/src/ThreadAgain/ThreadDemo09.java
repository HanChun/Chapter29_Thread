package ThreadAgain;
/*
 * �������ģʽ
 */

/*
 * ����ʽ�� 
 * class Single{
 * 		private static final Single s = new Single();
 * 		private Single(){}
 * 		public static Single getInstance(){
 * 			return s;
 * 		}
 * } 
 */

//����ʽ:�ӳټ��صĵ������ģʽ����
class Single{
	private static Single s = null;//������ܼ�final��
	private Single(){}
	public static Single getInstance(){
		//����ʽ���ڶ��̲߳�����ʱ��ᷢ����ȫ�����������ü����̣߳�һ����if�ж����Ȼ��һ��new������
			if(s==null){//˫���жϣ���ʡ����Դ��һ����ס�ˣ�֮�����ж�����
				
				synchronized(Single.class){
						if(s==null)
							s= new Single();
				}
			}
			return s;
	}
}


public class ThreadDemo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * ����ʽ���ص������ӳټ��أ�����������⣬������̷߳���ʱ;
 * ����ְ�ȫ���⣬���Լ�ͬ�����������ͬ��ʱ����ͬ��������ͬ���������У�
 * ������΢��Щ��Ч����˫���жϣ����Խ��Ч������
 * ��ͬ����ʱ�����Ǹ����������ֽ����ļ�����single.class��
 */

























