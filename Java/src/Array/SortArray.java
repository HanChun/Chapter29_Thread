package Array;

public class SortArray {
	/*��λ�ͺ����λ���αȽ�(С�ķ�ǰ��)
	 * ��С����
	 * ѡ��������ѭ������һ�Σ���ֵ������ͷ�Ǳ��λ����
	 */
	public static void selectSort(int[] arr){
		
		for(int x = 0; x<arr.length-1 ; x++){
			for(int y=x+1 ;y<arr.length ; y++){
				if(arr[x]>arr[y])
				{
					int temp = arr[x];
					arr[x]= arr[y];
					arr[y] = temp;
				}
			}
		}		
	}
	
	public static void printArray(int [] arr){
		System.out.print("[");
		for(int x=0; x<arr.length ; x++){
			if(x!=arr.length-1)
				System.out.print(arr[x]+", ");
			else
				System.out.print(arr[x]+"]");
		}
	}
	
	
	public static void main(String[] args){
		int[] arr = {5,1,6,4,2,8,9};
		selectSort(arr);
		printArray(arr);
	}
}
