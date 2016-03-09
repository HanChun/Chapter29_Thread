package MyFirst;

public class BubbleSort {
	public static void bubbleSort(int[] list){
		boolean needNextPass = true;
		for(int k=1 ; k < list.length && needNextPass ; k++ ){
			needNextPass = false ; 
			for(int i = 0 ; i<list.length -1; i++){
				if(list[i] > list[i+1]){
					//swap list[i] with list[i+1]
					int temp = list[i];
					list[i]  =  list[i+1];
					list[i+1] = temp;
 				}
			}
		}		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {2,3,2,5,6,1,-2,3,14,12};
		bubbleSort(list);
		for(int i = 0 ; i < list.length ; i ++){
			System.out.print(list[i] + " ");
		}
	}	
}
