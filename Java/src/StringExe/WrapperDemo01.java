package StringExe;

public class WrapperDemo01 {

	public static void main(String[] args) {
		// 1���ַ��������ֵ
		System.out.println(Integer.parseInt("123") +2);
		System.out.println(Integer.parseInt("110",2));
		//����ָ���Ľ��ƽ���ת��
		
		//2��������ֵ----->�ַ���
		String.valueOf(34);
		Integer.toString(34);
		
		//3���������ݡ�-->��װ����
		Integer i = new Integer(4);
		Integer ii = new Integer("4");
		Integer iii =Integer.valueOf(4);
		
		//4����װ����---->������ֵ ()
		int num = i.intValue();
		
	}

}
















