package InnerClass;

interface Inter1{
	void method();
}

class Test1{
	/*	static class Inner1 implements Inter1{
		@Override
		public void method() {
			// TODO Auto-generated method stub
			System.out.println("method run");
		}
	}*/
	
	static Inter1 function(){
		return new Inter1(){
			@Override
			public void method() {
				System.out.println("method run ");				
			}			
		};
	}
}
public class InnerClassDemo05 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test.function().method();
		
		show(new Inter(){
			@Override
			public void method() {
				// TODO Auto-generated method stub
				
			}
		});

	}
	public static void show(Inter in){
		in.method();
	}

}
