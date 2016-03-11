package StringAndValue;
/*
 * 任意进制之间的转换
 * n进制转换成m进制
 * 
 * 3转换成5进制
 */
public class demo5 {

	public static void main(String[] args) {
		String s = "2001201102";//3进制的串
		int n = 0;
		
		//把串变成真值（三进制成十进制）
		for(int i=0 ; i<s.length() ; i++ ){
			char c = s.charAt(i);
			n = n*3 + (c - '0');
		}
		
		 //十进制转换成五进制
		

	}

}
