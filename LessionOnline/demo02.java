package StringAndValue;
/**
 * @author HANXT
 *	简单的加密（每个ASCII 码移位）
 *	用s.toCharArray() 把string转成char型数组
 */

public class demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abcd" ;
		char[] cc = s.toCharArray();
		
		for(int i = 0 ; i< cc.length ; i++){
			cc[i] ++;
		}
		String s2 = new String(cc);//把数组又转换成字符串个
		System.out.println(s2);

	}

}
