package oop;
/*
 * 打印结果:
 * a
 * show run
 */
public class DemoStatic02 {

	public static void main(String[] args) {
		// 没有对象
		StaticExe.show();
		StaticExe s = null;//此时并没有加载类，但凡用到类中的内容的时候，类才会被加载
	}

}

class StaticExe{
	
	static{
		System.out.println("a");
	}
	public static void show(){
		System.out.println("show run");
	}
}