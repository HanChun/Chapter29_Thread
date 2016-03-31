package exeMyself;

public class DecToHex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toHex(60);
	}
	public static void toHex(int num){
		
		StringBuilder sb = new StringBuilder();
		while(num!=0){
			int temp =num & 15;
				
				if(temp>9){
					sb.append((char)(temp-10+'A'));
				}else
					sb.append(temp);
			
			num = num >>> 4 ;
		}

		System.out.println(sb.reverse());
	}

}
