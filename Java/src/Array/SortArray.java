package Array;

public class SortArray {
	/*��λ�ͺ����λ���αȽ�(С�ķ�ǰ��)
	 */
	public static void selectSort(int[] arr){
		
		for(int x = 0; x<arr.length-1 ; x++){
			for(int y=x+1 ;y<arr.length ; y++){
				if(arr[x]>arr[y]){
					int temp = arr[x];
					arr[x]= arr[y];
					arr[y] = temp;
				}
			}
		}
		
	}
}
