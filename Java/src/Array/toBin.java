package Array;

public class toBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toBin(6);
	}
	
	/*ʮ����--->������
	 * ˼·����2����2ȡ��Ĺ���
	 */
	public static void toBin(int num){
		StringBuffer sb = new StringBuffer();
		while(num>0){
			//System.out.print(num%2);
			sb.append(num%2);
			num = num/2;
		}
		
		System.out.println(sb.reverse());
	}
}
