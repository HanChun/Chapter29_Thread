package StringAndValue;
/**
 * @author HANXT
 * �ж��ַ����Ƿ��ظ�
 * Ӧ��s.lastIndexOf(c),
 * c���ַ����������ֵ�λ�õ�����
 */

public class demo01 {

	public static void main(String[] args) {
		String s = "asddfwdsa";
		boolean t = false;
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(s.lastIndexOf(c)!=i){
				t = true;
				break;
			}
		}
	}
}
