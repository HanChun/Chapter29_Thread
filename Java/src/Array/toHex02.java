package Array;

public class toHex02 {
	
	public static void main(String args[]){
		DectoBin(10);
	}
	
/* ����������е�Ԫ����ʱ�洢�������������Ӧ��ϵ��ÿһ��&15���ֵ����Ϊ����ȥ��
 * �����õı��Ϳ����ҵ���Ӧ��Ԫ�أ�Ϊ�˱� -10+'a' �򵥣�
 * 0  1  2  3  4  5  6  7  8  9  A  B  C  D  E  F == ʮ�������е�Ԫ��
 * 0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 
 */
	public static void toHex(int num){
		char[] chs = {  '0', '1' ,'2' , '3' ,'4' ,
						'5', '6' ,'7' , '8', '9' , 
						'A', 'B' ,'C' , 'D', 'E' ,'F'};
		char[] arr = new char[8];
		//�ַ�����һ�����壬��Ĭ�ϳ�ʼ��ֵΪ '\u0000' ��ʾһ����λ
		
		int x=arr.length;
		while(num>0){
			int temp = num & 15;
			//System.out.print(chs[temp]);
			arr[--x] = chs[temp];
			num = num >>> 4; 
		}
		
		for(int i=x ; i<arr.length; i++){
			System.out.print(arr[i] );
		}
		
		/*for(int j=x-1 ; j>=0 ; j--){
			System.out.print(arr[j] + ",");
		}*/
	}
	
	
	
	/*�����ʮ����Dec��ת���ɶ�����Bin
	 *���
	 */
	public static void DectoBin(int num){
		//��������Ʊ�
		char[] chs = {'0','1'};
		
		//������ʱ�洢����
		char[] arr = new char[32];
		
		//����һ�����������ָ��
		int pos =arr.length;
		
		while(num !=0){
			int temp = num&1;
			arr[--pos] = chs[temp];
			num = num >>>1;
		}
		for(int x=pos ;x<arr.length ; x++){
			System.out.print(arr[x]);
		}
	}
}

















