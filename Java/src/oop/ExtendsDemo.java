package oop;
/**有了继承以后加载就变得不一样了
 * this代表本类对象引用
 * super代表父类对象的引用
 */
class Fu{
	int num = 4;
}
class Zi extends Fu{
	int num = 5;
	
	void show(){
		System.out.println(num);//this.num
		System.out.println(super.num);//此时为父类的（父类也叫超类）
	}
}
public class ExtendsDemo {

	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();

	}

}
