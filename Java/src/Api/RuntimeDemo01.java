package Api;
/*Runtime对象
 * 该类没有提供构造函数
 * 说明不可以new对象；那么直接想到该类中方法都是静态的
 * 但是该类中还有非静态方法；
 * 说明该类中一定会提供方法获取本类对象；而且该方法是静态的，并且返回值是本类类型；
 * 
 * 
 * 该方式是static Runtime getRuntime();
 */
public class RuntimeDemo01 {
	public static void main(String[] args) throws Exception{
		Runtime r = Runtime.getRuntime();
		r.exec("notepad.exe  RuntimeDemo01.java");
		
		//Process p = r.exec("");
		//p.destroy();//杀掉此进程
	}
}
