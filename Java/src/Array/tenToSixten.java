package Array;

public class tenToSixten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//十进制  ---->  二进制  ---->  十六进制转换
		//
				int num = 60 ;
				
				//获取60的最低4位，通过 &15；
				int n1 = num & 15  ;//= 12
				char a1 = (char)(n1 - 10 + 'A');
				System.out.println(a1);
				//System.out.println( n1>9?(char)(n1-10+'A'):n1 );
				//  同时在运算的时候，和“：n1”前面的运算符会提升，char又变成int型了
				
				
				//获取下一组四位，将60右移4位
				int temp = num>>>4;
				
				//对temp的值进行最低四位的获取
				int n2 = temp & 15; // = 3
				System.out.println(n2);
				
				/* 0-9  'A'  'B'  'C'  'D'  'E'  'F'
				 * ASII  65   66   67   68   69   70
				 *       10   11   12   13   14   15
				 *      
				 *  'C'  12 - 10 =2 +'A' =(char)67      
				 */	
				
				/*
				 * 用>>>是防止负数一直补1，一直没有尽头
				 */
	}
}
