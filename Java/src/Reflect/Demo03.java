package Reflect;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> int1 = int.class;
		Class<?> int2 = Integer.class;
		Class<?> int3 = Integer.TYPE;//��װ�����涼��һ��TYPE������������ʾ������������͵��ֽ���
		System.out.println(int1==int2);
		System.out.println(int1==int3);
		System.out.println(int2==int3);
		System.out.println(int1);//int
		System.out.println(int2);//class java.lang.Integer
		System.out.println(int3);//int
		
		Class<String[]> s = String[].class;
		Class<int[]> i = int[].class;
		//System.out.println(i==s);��������Ͳ���ͨ����һ����int��һ����String		
	}

}









