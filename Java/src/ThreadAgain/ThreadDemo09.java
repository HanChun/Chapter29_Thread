package ThreadAgain;
/*
 * 单例设计模式
 */

/*
 * 饿汉式： 
 * class Single{
 * 		private static final Single s = new Single();
 * 		private Single(){}
 * 		public static Single getInstance(){
 * 			return s;
 * 		}
 * } 
 */

//懒汉式:延迟加载的单例设计模式事例
class Single{
	private static Single s = null;//这个不能加final啦
	private Single(){}
	public static Single getInstance(){
		//懒汉式，在多线程操作的时候会发生安全隐患；进来好几个线程，一起卡在if判断那里，然后一起new！！！
			if(s==null){//双重判断，节省了资源，一个锁住了，之后不用判断锁了
				
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
 * 懒汉式的特点在于延迟加载：但其存在问题，如果多线程访问时;
 * 会出现安全问题，可以加同步来解决；加同步时，用同步代码块和同步函数都行，
 * 但是稍微有些低效；用双重判断，可以解决效率问题
 * 加同步的时候锁是该类所属的字节码文件对象（single.class）
 */

























