package exe;
import java.util.HashMap;
import java.util.Map;
/*
 * Problem Description:
给定一个长度为N的数组，找出一个最长的单调自增子序列（不一定连续，但是顺序不能乱）。
例如：给定一个长度为8的数组A{ 1, 3, 5, 2, 4, 6, 7, 8 }，则其最长的单调递增子序列为
{1, 2, 4, 6, 7, 8 }，长度为6。
要求最好能过滤输入的合法性，即能够使用正则匹配输入内容，只允许
输入数字、空格、-这些内容成为数组。​
 */
import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
	
	/*	Scanner sc = new Scanner(System.in);
		int[] a = new int[8];
		
		for(int x =0; x<8; x++){
			int b =sc.nextInt();
			a[x] =b;						
		}*/
		int[] a = new int[]{1, 3, 5, 2, 4, 6, 7, 8};
		printArray(a);
		
		int[] result = getLongestString(a);
	}

	

	private static int[] getLongestString(int[] a) {
		// TODO Auto-generated method stub
		String b = a.toString();
		Map recordMap;
		System.out.println(a.length);
		for(int i=0; i<a.length ;i++){
			int length =1;
			for (int j = i; j < a.length-1; j++) {
				if(a[j]<a[j+1])
					length = length+1;
				else{
					System.out.println(" i "+ i +" j "+ j +" length "+ length);
					recordMap=weRecord(i,j,length);
					break;	}			
			}			
		}
		
				
		return a;
	}



	private static Map weRecord(int i, int j, int length) {
		// TODO Auto-generated method stub
		Map a = new HashMap();
		a.put(i, j);
		Map b = new HashMap();
		b.put(length, a);
		System.out.println(b);
		return b;
		
		//int c=findMaxlength(b);
		
		//return (Map)(b.get(c));
	}



/*	private static  int findMaxlength(Map b) {
		for (int i = 0; i < array.length; i++) {
			
		}
		
		return 0;
		
	}
*/


	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			if(i<a.length)
				System.out.print(a[i]+" ");
			else
				System.out.print(a[i]);			
		}
		System.out.println();
	}

}
