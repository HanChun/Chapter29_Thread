package Array;
/*Insert an element in an ordered array to make sure the
 * array still in the right order
 * HalfSort
 */
public class InserElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={2,4,6,7,19,32,45};//8
		int index= getIndex_2(arr,8) ;
		System.out.println("index = " + index);
	}
	
	public static int getIndex(int[] arr, int key){
		
		return -1;
	}
	public static int getIndex_2(int[] arr,int key){
		int min = 0;
		int max = arr.length-1;
		int mid;
		while(min<=max){
			mid = (min +max)>>1;
			if(key>arr[mid])
				min= mid +1;
			else if(key< arr[mid])
				max = mid -1;
			else
				return mid;
		}
		return max;
	}
}
