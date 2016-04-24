package StringExe;

public class WrapperDemo01 {

	public static void main(String[] args) {
		// 1、字符串变成数值
		System.out.println(Integer.parseInt("123") +2);
		System.out.println(Integer.parseInt("110",2));
		//按照指定的进制进行转换
		
		//2、基本数值----->字符串
		String.valueOf(34);
		Integer.toString(34);
		
		//3、基本数据—-->包装对像
		Integer i = new Integer(4);
		Integer ii = new Integer("4");
		Integer iii =Integer.valueOf(4);
		
		//4、包装对像---->基本数值 ()
		int num = i.intValue();
		
	}

}
















