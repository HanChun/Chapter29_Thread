package Array;

public class Trans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toBin(-6);
	}
	
	
	/**
	 * ʮ����-->������
	 */
	public static void toBin(int num){
		trans(num,1,1);
	}
	/**
	 * ʮ����-->�˽���
	 */
	public static void toOct(int num){
		trans(num,7,3);	
	}
	
	/**
	 * ʮ����-->ʮ������
	 */
	public static void toHex(int num){
		trans(num,15,4);	
	}
	
	
	/**base   ָ����Ҫȥ'&'����;
	 * offset ָ�����ƶ���λ��;
	 */
	public static void trans(int num,int base,int offset){
		if(num==0){
			System.out.println(0);
			return;
		}
		
		//��
		char[] chs = {'0','1','2','3',
					  '4','5','6','7',
					  '8','9','A','B',
					  'C','D','E','F'};
		//����
		char[] arr = new char[32];
		int pos = arr.length;
		
		while(num!=0)
		{
			int temp = num & base ;
			arr[--pos] = chs[temp];
			num = num>>>offset ;
		}
		
		for(int i =pos ; i<arr.length ; i++)
		{
			System.out.print(arr[i]);
		}
	}
}
