package StringAndValue;
/**
 * @author HANXT
 * ���ַ����������
 * s.charAt(0)-48
 */

public class demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  ="5364";
		int n = s.charAt(0);//��5��ASCLL���������
		int m = s.charAt(0) - 48 ;
		
		int l = 0;
		for(int i = 0; i<s.length() ; i++){
			l = l*10 + (s.charAt(i)-'0');
		}

	}

}
