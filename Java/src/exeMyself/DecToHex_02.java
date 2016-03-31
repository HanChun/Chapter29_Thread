package exeMyself;

public class DecToHex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void toHex(int num){
		char[] arr = {'1','2','3','4',
					  '5','6','7','8',
					  '9','A','B','C',
					  'D','E','F'	  };
		
		char[] res = new char[8];
		int x =res.length-1;
		
		while(num!=0){
			 int temp = num & 15;
			 res[x--]=arr[temp];
			 num = num>>>4;
		}
	}
	

}
