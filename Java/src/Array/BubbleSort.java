package Array;

public class BubbleSort {
	/*���ڵ�����Ԫ�ؽ��бȽ�
	 * ������������ͻ�λ
	 * ��������
	 */
	/**Ҳ��Ƕ��ѭ��
	 * ��һ�������С����ǰ�ܣ�����������ܣ����ֵ�ܵ��������
	 * �ڶ��������Ǵ���ű꿪ʼ���򣻵ڶ����ֵҲ���Լ���λ����
	 * 
	 * ϣ��������������������ѭ������λ���㣬Ч��Ҳ����ߵ�
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static void String(int[] arr){
		for(int x=0; x<arr.length-1 ; x++){//˵��ѭ���Ĵ���
			for(int y=0; y<arr.length-x-1  ; y++){
				if(arr[y]>arr[y+1]){
					
					int temp = arr[y] ;
					arr[y]=arr[y+1];
					arr[y+1] = temp;					
				}
			}
		}
	}
}
