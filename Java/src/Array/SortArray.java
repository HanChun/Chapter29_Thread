package Array;

public class SortArray {
	/*首位和后面的位依次比较(小的放前面)
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
