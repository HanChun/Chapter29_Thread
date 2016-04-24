package StringExe;

public class wrapperDemo {

	public static void main(String[] args) {
		/**
		 * 场景：通过文本框获取用户输入的数字数据，可惜得到的
		 * 都是字符串；如果想要对字符串中的数字进行运算的话，必须将字符串转换成数字；
		 * 
		 * 基本数据类型对象包装类：即java将基本数据类型值封装成了对象
		 * 好处是：因为可以提供更多的操作基本数值的方法
		 * 8种基本数据类型
		 * byte   	Byte
		 * short  	Short
		 * int    	Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * boolean	Boolean
		 * char		Character
		 */
		System.out.println(Integer.MAX_VALUE + "   "+ Integer.MIN_VALUE);
		
		//一个整数变成它的二进制
		System.out.println(Integer.toBinaryString(10));
	}

}
