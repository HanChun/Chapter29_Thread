package oop;
/*ģ�巽�����ģʽ
 * �ڶ��幦��ʱ�����ܵ�һ������ȷ���ģ�������һ�����ǲ�ȷ���ģ�
 * ��ȷ���Ĳ�����ʹ�ò�ȷ���Ĳ��֣���ô��ʱ���ͽ���ȷ���Ĳ��ֱ�¶��ȥ����
 * ���������ȥ���
 * 
 * ���󣺻�ȡһ�γ������е�ʱ��
 * ԭ����ȡ����ʼ�ͽ�����ʱ�䣬�����
 * 
 * 
 * ��ȡʱ�䣺System.currentTimeMillis();
 */
abstract class GetTime{
		public final void getTime(){
			long start = System.currentTimeMillis();
			
			runcode();
			
			long end   = System.currentTimeMillis();
			System.out.println("���룺 " + (end - start));
		}
		
		public abstract void runcode();
	}

class SubTime extends GetTime{
		public void runcode(){
			
		}
	}
public class TemplateDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubTime gt = new SubTime();
		gt.getTime();
	}

}
