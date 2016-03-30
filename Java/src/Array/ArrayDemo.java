package Array;

public class ArrayDemo {

	public static void main(String[] args) {
		/*
		 * 获取数组中的最大值
		 */
		int[] arr = new int[]{10,9,8,23,3,45,57,12,345};
		int temp = arr[0]; 
		
		for(int i = 0 ; i<arr.length-1 ; i++){
			if(arr[i+1] > arr[i]){ 
				temp = arr[i+1];
			}			
		}
		System.out.println(temp);
	}
   
	
	public static int getMax_1(int[] a){ 
		int max = a[0];
		
		for(int x = 1; x < a.length ; x++){ 
			if(a[x]>max)
				max = a[x] ;
		}		
    	return max;
    }
	
	public static int getMax_2(int[] arr){
		int max = 0;
		for (int x=1; x<arr.length ; x++){
			if(arr[x]>arr[max])
				max = x;
		}
		return arr[max];
	}
	
	public static int getMin(int[] arr){
		int min = 0;
		for(int x =1;x<arr.length ; x++){
			if(arr[x]<arr[min])
				min = x;
		}
		return arr[min];
	}
	
}

































