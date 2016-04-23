package Reflect;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> int1 = int.class;
		Class<?> int2 = Integer.class;
		Class<?> int3 = Integer.TYPE;//包装类里面都有一个TYPE常量，用来表示其基本数据类型的字节码
		System.out.println(int1==int2);
		System.out.println(int1==int3);
		System.out.println(int2==int3);
		System.out.println(int1);//int
		System.out.println(int2);//class java.lang.Integer
		System.out.println(int3);//int
		
		Class<String[]> s = String[].class;
		Class<int[]> i = int[].class;
		//System.out.println(i==s);编译根本就不会通过，一个是int，一个是String		
	}

}









