package StringAndValue;
/**
 * regular Expression
 * split
 */

public class demo06 {
	public static void main(String args[]){
		String s = "abc  xyz  kkk  yyy";
	  //String[] ss = s.split(" {1,}");//空格的次数，最少一次，最多多次
	  //String[] ss = s.split(" +");
		String[] ss = s.split("\\+"); 

		for(int i=0 ; i<ss.length ; i++){
			System.out.println(ss[i]);
		}
		
		String m = "AZ125";
		System.out.println(m.matches("[A-Z]{1,2}[0-9]{1,5}"));
		
		String t = "a+b+c";
		t.split("\\+");
		
		String l = "abckkd kj 2005-12-05 fs kjafjsakfds";
		l = l.replaceAll("[0-9]{4}-[0-9]{2}-[0-9]{2}","*** ");//日期的正则格式
	//  l = l.replaceAll("([0-9]{4})-([0-9]{2})-([0-9]{2})","$3/$2 $1");
		System.out.println(s);
	} 
}
