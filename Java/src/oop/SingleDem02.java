package oop;

//方法被调用时才初始化，也叫作对象的延时加载；称为：懒汉式
class Sing{
	private static Sing s=null;
	private Sing(){
		
	}
	public static Sing getInstance(){
		if(s==null){
			synchronized(Single.class)//不读锁就可以提高效率
			{
				if(s==null)
					s=new Sing();
			}
		}
		return s;
	}
}


public class SingleDem02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
