package StringExe;

import java.util.Arrays;

public class StringExe {

	public static void main(String[] args) {
		// 1���ַ������飬��С��������
		String[] strs = {"abc","nba","cctv","itcast"};
		printArray(strs);
		sortString(strs);
		printArray(strs );
	}
	
	private static void printArray(String[] strs) {
		// TODO Auto-generated method stub
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]+" ");
		}
		System.out.println();
	}

	/**
	 * �ַ�����������
	 * ˼·��1��
	 * @param strs
	 */
	public static void sortString(String[] strs) {
		/*	for (int i = 0; i < strs.length-1; i++) {
				for (int j = i+1; j < strs.length; j++) {
					//if(strs[i]>strs[j])  ����Ƚ��÷���
					if(strs[i].compareTo(strs[j])>0)
						swap(strs,i,j);
				}
		}	*/
		Arrays.sort(strs);
	}

	public static String[] swap(String[] strs, int i, int j) {
		String temp = strs[i];
		strs[i] = strs[j];
		strs[j] = temp;
		return strs;
	}



}
