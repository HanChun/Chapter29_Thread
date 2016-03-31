package Array;

public class toHexadecimal {

	public static void main(String[] args) {
		// 60二进制的32位的表现形式
		System.out.println(Integer.toBinaryString(60));
		toHex(60);
	}	
	//十进制-->十六进制
	public static void toHex(int num){
		/*32位里面有几个4组，有8个，
		 * 所以最多 8次
		 */
		StringBuffer sb = new StringBuffer();
		
		 for(int x=0 ; x<8 ; x++){
			int n1 = num & 15;
				if(n1>9)
				  //System.out.println((char)(n1-10+'A'));
					sb.append((char)(n1-10+'A'));
				else
				  //System.out.println(n1);	
					sb.append(n1);
				num = num>>>4 ;
			 }
			System.out.println(sb.reverse());
		}
}

