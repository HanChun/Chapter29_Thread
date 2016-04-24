package StringExe;

import java.util.Arrays;

public class WrapperDemo03{
	public static void main (String[] args){
		String str = "23 9 -4 18 100 7";
		str = sortNumString(str);
		System.out.println("nums " + str);
	}

	private static String sortNumString(String str) {
		//1��������ַ�������
		String[] str1= str.split(" ");
		
		//2���ַ�������������
		int[] a =parseIntArray(str1);
		
		//3�������������
		Arrays.sort(a);
		
		//4��������������ַ���
		return toStr(a);
	}

	private static String toStr(int[] a) {
		//��һ������������ַ���
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< a.length ;i++ ){
			if(i!=nums.length-1){
				sb.append(nums[i]+" ");
			}
		}
		return sb.toString();
	}

	private static int[] parseIntArray(String[] str1) {
		int[] b = new int[str1.length];
		
		for(int i = 0 ; i<str1.length ;i++ ){
			b[i] = Integer.parseInt(str1[i]);
		}		
		return b;
	}
	
	
	
} 
