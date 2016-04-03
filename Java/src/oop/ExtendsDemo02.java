package oop;
//子类必然访问到父类中的构造函数
class F{
	F(int x){
		System.out.println("fu run..."+ x);
	}
}
class Z extends F{
	Z(){
		super(4);//由于父类的构造方法是带参数的，子类继承默认构造里面是super()，这样不行，要变成super(参数)
		System.out.println("zi....");
	}
	Z(int x){
		super(3);
		System.out.println("zi..."+x);
	}
}


public class ExtendsDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z = new Z(1);

	}
}
