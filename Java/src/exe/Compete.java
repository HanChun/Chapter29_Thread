package exe;

public class Compete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(10));
		//动态规划：已经计算好的子问题存储起来，以后直接取用
		
	}

	 static boolean f(int x) {
		// TODO Auto-generated method stub
		 int[] op ={1,3,7,8};
		 for(int i=0 ; i<op.length ;i++){
			 if(x>=op[i]){
				 if(f(x-op[i])==false) return true;//博弈过程中常用的招法，对方必输，则我方必赢；
			 }
		 }
		return false;		
	}
}
