package StringExe;

public class StringExe02 {

	public static void main(String[] args) {
		// 一个文本里面有几个小串
		String str ="k1itcastja2itcastshfae3itcastofk4itcastln5itcastlandivu6itcastiagiuar";
		String key = "itcast";
		
		int num = find(str, key);
		System.out.println("num : "+num);
	}

	private static int find(String str, String key) {
		// TODO Auto-generated method stub
		int x=0;
		int num=0;
		int index = 0;
		while(x>=0){
			 x = str.indexOf(key,index);
			index = index+str.length();
			num++;
		}
		return num-1;
	}

}
