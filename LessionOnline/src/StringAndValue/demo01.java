package StringAndValue;
/**
 * @author HANXT
 * 判断字符串是否重复
 * 应用s.lastIndexOf(c),
 * c在字符串中最后出现的位置的索引
 */

public class demo01 {

	public static void main(String[] args) {
		String s = "asddfwdsa";
		boolean t = false;
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(s.lastIndexOf(c)!=i){
				t = true;
				break;
			}
		}
	}
}
