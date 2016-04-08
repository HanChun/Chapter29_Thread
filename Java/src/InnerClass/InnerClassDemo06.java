package InnerClass;

interface Inter{
	void method();
}
class Test{
	static class Inner implements Inter{
		@Override
		public void method(){
			System.out.println("method run");
		}		
	}
	
	static Inter function(){
		return new Inner();
	}	
}

public class InnerClassDemo06 {		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test.function().method();
		//Test.function()  类名直接调用方法说明方法是静态的
		//然后又调用.method() 说明调用function方法后返回值类型是Inter
	}

}
