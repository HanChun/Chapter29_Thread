package Array;

public class dimensionalArray {

	public static void main(String[] args) {

		int[][] arr = new int[3][4];
		/*
		 * 3�Ƕ�ά����ĳ��ȣ�4�Ƕ�ά������ÿһ��һά����ĳ���
		 */
		
		int[][] ar = new int[3][];
		/*
		 * �˶�ά���鳤��Ϊ3��������һά����ĳ���ȴ��ȷ��
		 */
		System.out.println(ar);//��άar�ĵ�ֵַ
		System.out.println(ar[0]);
		//null,��Ϊ��ά�е�һά���鲢û�г�ʼ����
		//�������������������ͣ����Գ�ʼ��ֵ��Ϊ��
		
		ar[0] = new int[3];
		ar[1] = new int[1];
		ar[2] = new int[2];
		//��ÿһ����άС��������ֶ���ʼ����
		//��ʱ��ά�����õ���ÿ���ڴ������,���ͼ
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		int[][] a = {{1,2,3,98},{4,5,6},{7,8,9,7,1}};
		/*Ӧ�ó���
		 * e.g.һ����˾��ͬ�����飬��ͬ���ȵ�����ҵ��
		 */
		int m =0;
		for(int x=0 ; x<arr.length ; x++){
			for(int y=0; y<arr[x].length ; y++){
				m = m+a[x][y];
			}
		}
		
		//һά��������ֶ��巽ʽ
		int[] x;
		int y[];
		
		//��ά��������ֶ��巽ʽ
		int[][] o;
		int p[][];
		int[] q[];
		
		int[] r,n[];//���Ƕ�����һ��һλ����r����ά����n
		
		
	}

}




















