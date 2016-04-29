package exe;

public class MyA {

	public static void main(String[] args) {
		final int N =1000*1000;
		int n= 0;
		for(int i=0 ; i<N ; i++){
			double x = Math.random();
			double y = Math.random();
			if(x*x+y*y<1) n++;
		}
		double pi =(double)n/N *4;
		System.out.println(pi);
	}

}
