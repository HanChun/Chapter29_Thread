package exe;

import java.util.Scanner;
public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		if(m>=100 && m<=n && n<=999){
		
			for(int i =m ;i<=n ;i++){
				int count = 0;
				
				int a = i/100;//��λ
				int b = i%10;//��λ
				int c = (i/10)%10;//ʮλ
				int sum =a*a*a+b*b*b +c*c*c;
				boolean flag = (sum==i);
				if(flag){
					System.out.println(sum+".......");
					count++;
				}
				
			}
			
			
		}
	}
}
