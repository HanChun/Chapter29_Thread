package StringAndValue;
/**
 * @author HANXT
 *	�򵥵ļ��ܣ�ÿ��ASCII ����λ��
 *	��s.toCharArray() ��stringת��char������
 */

public class demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abcd" ;
		char[] cc = s.toCharArray();
		
		for(int i = 0 ; i< cc.length ; i++){
			cc[i] ++;
		}
		String s2 = new String(cc);//��������ת�����ַ�����
		System.out.println(s2);

	}

}
