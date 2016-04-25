package StringExe;

public class StringExe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "itcast_sh";
		for(int x=0 ; x<s.length() ; x++){//控制行数
			for(int y = 0 , z=s.length()-x ; z<=s.length() ; y++,z++){//控制列数和列内容
				String b = s.substring(y, z);
				System.out.print( b+"  ");
			}
			System.out.println();
		}
	}
}
