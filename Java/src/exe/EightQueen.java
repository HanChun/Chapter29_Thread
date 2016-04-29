package exe;

public class EightQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[8];//表示棋盘（a[i]表示每一行）
		f(a,0);  
	}
	//列是row；行是col
	private static boolean check(int[] a, int row,int col) {
		for(int i=0 ; i<row ; i++){
			//纵向上的冲突
			if(col==a[i]) return false;
			
			//对角线检验：两个王后的行差距等于列差距，其就在对角线上
			if(row-i == Math.abs(a[i]-col))  return false;
		}
		return true;
	}
	//在数组a中放置第k个皇后,也代表第k行
	private static void f(int[] a, int k) {
		// TODO Auto-generated method stub
		if(k==8){
			show(a);
			return;
		}
		for(int i=0 ; i<8 ;i++){
			a[k]=i;//表示对第k行逐一测试从0到7这8个位置
			
			//对a数组中第k个(列)皇后放在位置i，进行检查
			if(check(a,k,i)){
				f(a,k+1);
			}
		}
	}
	private static void show(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0; i<a.length ;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}



}
