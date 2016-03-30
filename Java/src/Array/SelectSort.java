package Array;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[]{10,98,23,45,89};
		sort(a);
		printArray(a);
	}
	 
	public static void sort(int[] arr){
		for(int x = 0; x<arr.length-1 ; x++){
			for(int y = x+1 ; y<arr.length ; y++){
				if(arr[x]> arr[y]){
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}				
			}
		}
	}
	
	public static void printArray(int[] arr ){
		for(int i=0 ; i<arr.length ; i++ ){
			System.out.print(arr[i]+"  ");
		}
	}
}
