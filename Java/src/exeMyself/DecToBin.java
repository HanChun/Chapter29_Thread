package exeMyself;

public class DecToBin {
	/*十进制到二进制
	 * 查表法
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecToBin(10);
	}
	public static void DecToBin(int num){
		int[] a = new int[]{0,1};
		int[] b = new int[32];
		int x = b.length-1;
				
		while(num>0){
			int temp = num & 1;
			b[x--] = a[temp];
			num = num>>>1 ;
		}
		
		for(int i =x+1 ; i<b.length ; i++){
			System.out.print(b[i]);
		}
	}

}
