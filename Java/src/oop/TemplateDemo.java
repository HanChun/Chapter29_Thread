package oop;
/*模板方法设计模式
 * 在定义功能时，功能的一部分是确定的，但是有一部分是部确定的，
 * 且确定的部分在使用不确定的部分，那么这时，就将不确定的部分暴露出去；由
 * 该类的子类去完成
 * 
 * 需求：获取一段程序运行的时间
 * 原理：获取程序开始和结束的时间，并相减
 * 
 * 
 * 获取时间：System.currentTimeMillis();
 */
abstract class GetTime{
		public final void getTime(){
			long start = System.currentTimeMillis();
			
			runcode();
			
			long end   = System.currentTimeMillis();
			System.out.println("毫秒： " + (end - start));
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
