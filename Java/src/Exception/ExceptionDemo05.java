package Exception;
/*
 * 毕老师用电脑上课;
 */ 
class ComputerBule extends Exception{
	ComputerBule(String message){
		super(message);
	}
}
class ComputerBroke extends Exception{
	ComputerBroke(String message){
		super(message);
	}
}
class MaoYanException extends RuntimeException{
	MaoYanException(String message){
		super(message);		
	}
}
class NoPlanException extends Exception{
	NoPlanException(String message){
		super(message);
	}
}

class Computer	{
	private int state = 1; 
	
	public void run() throws ComputerBule, ComputerBroke{
		if(state == 2)
				throw new ComputerBule("蓝屏了");
		if(state == 3)
				throw new MaoYanException("冒烟了");
		if(state == 4)
				throw new ComputerBroke("坏啦");
		System.out.println("电脑运行");
	}
	public void reset(){
		state =1;
		System.out.println("电脑重启");
	}
}


class Teacher{
	private String name;
	private Computer cmpt;
	
	Teacher(String name){
		this.name =name;
		cmpt = new Computer();
	}
	
	public void run() throws NoPlanException{
		try {
			cmpt.run();
			System.out.println("讲课");
		} catch (ComputerBule e) {
			// TODO Auto-generated catch block
			cmpt.reset();
		} catch (ComputerBroke e) {
			dotest();
			throw new NoPlanException("课时无法继续"+e.getMessage());
			//如果这个问题真发生了，其就直接抛出去了，不会继续执行了，so dotest()放上面
		}
		System.out.println("讲课");
	}
	
	public void dotest(){
		System.out.println("做练习吧。。。");
	}

}
public class ExceptionDemo05 {
	public static void main(String[] args){
		Teacher t = new Teacher("毕老师");
		try {
			t.run();
		} catch (NoPlanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("换电脑或者放假");
		}
	}
}





















