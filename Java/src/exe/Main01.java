package exe;

import java.util.Scanner;
public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		if(m>=100 && m<=n && n<=999){
			
			int count = 0;
			for(int i =m ;i<=n ;i++){
								
				int a = i/100;//百位
				int b = i%10;//个位
				int c = (i/10)%10;//十位
				int sum =a*a*a+b*b*b +c*c*c;
				boolean flag = (sum==i);
				if(flag){
					System.out.print(sum+" ");
					count++;
				}				
			}
			if(count==0)
				System.out.println("no");
			
		}
	}
}
