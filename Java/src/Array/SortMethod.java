package Array;

import java.util.Arrays;

public class SortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{10,9,8,45,23};
		Arrays.sort(a);
		swap(a,0,2);
	}
	public static void swap(int[] arr, int a ,int b){
		 int temp = arr[a];
		 arr[a] = arr[b];
		 arr[b] = temp;
	}
}
