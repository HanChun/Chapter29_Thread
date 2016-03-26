package StringAndValue;
/*
 * 任意进制之间的转换
 * n进制转换成m进制
 * 
 * 3转换成5进制
 */
public class demo05 {
 
	public static void main(String[] args) {
		String s = "2001201102";//3进制的串
		int n = 0;
		
		//把串变成真值（三进制成十进制）
		for(int i=0 ; i<s.length() ; i++ ){
			char c = s.charAt(i);
			n = n*3 + (c -'0');
		}
		System.out.println(n);
		
		//十进制转换成五进制
		String s2 ="";
		//把数值转换成n进制的字符串
		for(;;){
			if(n==0) break;
			s2 = n%5 + s2;
			n/=10;
		}
		System.out.println(s2);
	}
}
