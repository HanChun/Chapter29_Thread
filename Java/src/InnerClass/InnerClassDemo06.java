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
		//Test.function()  ����ֱ�ӵ��÷���˵�������Ǿ�̬��
		//Ȼ���ֵ���.method() ˵������function�����󷵻�ֵ������Inter
	}

}
