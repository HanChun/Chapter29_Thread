package oop;

class Zoo{
	void fish(){}
	
}

public class ObjectDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo z = new Zoo();
		System.out.println(z.hashCode());
		System.out.println(Integer.toHexString(z.hashCode()));
		//��int�͵���������ȥ�����ʮ�����Ƶ��ַ������
		System.out.println(z.toString());
		
		Class c = z.getClass();
		c.getMethods();
		System.out.println(c.getName());
		System.out.println(z.toString());
		System.out.println(z.getClass().getName()+"@"+Integer.toHexString(z.hashCode()));
		
		
	} 
}
