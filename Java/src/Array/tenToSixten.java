package Array;

public class tenToSixten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʮ����  ---->  ������  ---->  ʮ������ת��
		//
				int num = 60 ;
				
				//��ȡ60�����4λ��ͨ�� &15��
				int n1 = num & 15  ;//= 12
				char a1 = (char)(n1 - 10 + 'A');
				System.out.println(a1);
				//System.out.println( n1>9?(char)(n1-10+'A'):n1 );
				//  ͬʱ�������ʱ�򣬺͡���n1��ǰ����������������char�ֱ��int����
				
				
				//��ȡ��һ����λ����60����4λ
				int temp = num>>>4;
				
				//��temp��ֵ���������λ�Ļ�ȡ
				int n2 = temp & 15; // = 3
				System.out.println(n2);
				
				/* 0-9  'A'  'B'  'C'  'D'  'E'  'F'
				 * ASII  65   66   67   68   69   70
				 *       10   11   12   13   14   15
				 *      
				 *  'C'  12 - 10 =2 +'A' =(char)67      
				 */	
				
				/*
				 * ��>>>�Ƿ�ֹ����һֱ��1��һֱû�о�ͷ
				 */
	}
}
