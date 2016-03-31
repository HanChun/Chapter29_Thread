package Array;

public class toHex02 {
	
	public static void main(String args[]){
		DectoBin(10);
	}
	
/* 查表法：将所有的元素临时存储起来，建立起对应关系，每一次&15后的值都作为索引去查
 * 建立好的表，就可以找到对应的元素（为了比 -10+'a' 简单）
 * 0  1  2  3  4  5  6  7  8  9  A  B  C  D  E  F == 十六进制中的元素
 * 0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 
 */
	public static void toHex(int num){
		char[] chs = {  '0', '1' ,'2' , '3' ,'4' ,
						'5', '6' ,'7' , '8', '9' , 
						'A', 'B' ,'C' , 'D', 'E' ,'F'};
		char[] arr = new char[8];
		//字符数组一旦定义，其默认初始化值为 '\u0000' 表示一个空位
		
		int x=arr.length;
		while(num>0){
			int temp = num & 15;
			//System.out.print(chs[temp]);
			arr[--x] = chs[temp];
			num = num >>> 4; 
		}
		
		for(int i=x ; i<arr.length; i++){
			System.out.print(arr[i] );
		}
		
		/*for(int j=x-1 ; j>=0 ; j--){
			System.out.print(arr[j] + ",");
		}*/
	}
	
	
	
	/*查表法把十进制Dec数转换成二进制Bin
	 *查表法
	 */
	public static void DectoBin(int num){
		//定义二进制表
		char[] chs = {'0','1'};
		
		//定义临时存储容器
		char[] arr = new char[32];
		
		//定义一个操作数组的指针
		int pos =arr.length;
		
		while(num !=0){
			int temp = num&1;
			arr[--pos] = chs[temp];
			num = num >>>1;
		}
		for(int x=pos ;x<arr.length ; x++){
			System.out.print(arr[x]);
		}
	}
}

















