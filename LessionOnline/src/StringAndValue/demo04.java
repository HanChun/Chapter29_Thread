package StringAndValue;
/**
 * @author HANXT
 * �ڶ������κ�һ����ȫ��ͬ����λ��������һ���㷨 
 * ����λ�����е����ֵ��-����λ�����е���Сֵ��= 
 *   �����˺�����һ���̶�����ֵ
 * 6174
 */
public class demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5346; 
		
		for(;;){
			char[] cc = (n + "").toCharArray();
			java.util.Arrays.sort(cc); //�������������,��С����
			
			int min = 0 ;
			for(int i=0 ; i<cc.length ; i++ ) min  =  min*10 + ( cc[i] - '0' );
			//System.out.println(min);
			
			int max = 0 ;
			for(int i=cc.length-1 ; i>=0 ; i--) max = max*10 + ( cc[i] - '0');
			//System.out.println(max);
			
			int n2 = max - min;
			if(n==n2) break;
		}		
	}
}












