package oop;
//多态，将对象调用这件事情变得简单了
abstract class S{
	public abstract void study();
	public void sleep(){
		System.out.println("躺着睡......");
	}
}
class BS extends S{
	@Override
	public void study() {
		System.out.println("base study");
	}
	public void sleep(){
		System.out.println("座着睡......");
	}
}
class Adv extends S{
	@Override
	public void study() {
		System.out.println("adv study");
	}	
}

class DoStudent{
	public void doSome(S stu){
		stu.study();
		stu.sleep();
	}
}
public class DuoTaiDemo01 {
	public static void main(String[] args) {
		/*
	 		BS bs = new BS();
			bs.study();
			bs.sleep();
			Adv adv = new Adv();
			adv.study();
			adv.sleep();
		*/
		DoStudent ds = new DoStudent();
		ds.doSome(new BS());
		ds.doSome(new Adv());
	}
	
	
	/*public void doSome(S s){
		s.study();
		s.sleep();
	}*/
}
