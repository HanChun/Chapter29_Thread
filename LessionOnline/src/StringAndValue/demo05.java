package StringAndValue;
/*
 * �������֮���ת��
 * n����ת����m����
 * 
 * 3ת����5����
 */
public class demo05 {
 
	public static void main(String[] args) {
		String s = "2001201102";//3���ƵĴ�
		int n = 0;
		
		//�Ѵ������ֵ�������Ƴ�ʮ���ƣ�
		for(int i=0 ; i<s.length() ; i++ ){
			char c = s.charAt(i);
			n = n*3 + (c -'0');
		}
		System.out.println(n);
		
		//ʮ����ת���������
		String s2 ="";
		//����ֵת����n���Ƶ��ַ���
		for(;;){
			if(n==0) break;
			s2 = n%5 + s2;
			n/=10;
		}
		System.out.println(s2);
	}
}
