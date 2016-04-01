package Array;

public class dimensionalArray {

	public static void main(String[] args) {

		int[][] arr = new int[3][4];
		/*
		 * 3是二维数组的长度，4是二维数组中每一个一维数组的长度
		 */
		
		int[][] ar = new int[3][];
		/*
		 * 此二维数组长度为3，但其中一维数组的长度却不确定
		 */
		System.out.println(ar);//二维ar的地址值
		System.out.println(ar[0]);
		//null,因为二维中的一维数组并没有初始化呢
		//而数组是引用数据类型，所以初始化值都为空
		
		ar[0] = new int[3];
		ar[1] = new int[1];
		ar[2] = new int[2];
		//对每一个二维小数组进行手动初始化，
		//此时二维数组拿的是每个内存的引用,详见图
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		int[][] a = {{1,2,3,98},{4,5,6},{7,8,9,7,1}};
		/*应用场景
		 * e.g.一个公司不同销售组，不同季度的销售业绩
		 */
		int m =0;
		for(int x=0 ; x<arr.length ; x++){
			for(int y=0; y<arr[x].length ; y++){
				m = m+a[x][y];
			}
		}
		
		//一维数组的两种定义方式
		int[] x;
		int y[];
		
		//二维数组的三种定义方式
		int[][] o;
		int p[][];
		int[] q[];
		
		int[] r,n[];//这是定义了一个一位数组r，二维数组n
		
		
	}

}




















