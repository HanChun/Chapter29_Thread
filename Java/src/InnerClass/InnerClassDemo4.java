package InnerClass;
/*�����ڲ��ࣺ
 * 1�������ڲ�����ʵ�����ڲ���ļ�дģʽ
 * 2�����������ڲ����ǰ�᣺
 * 		�ڲ�������Ǽ̳�һ�������ʵ�ֽӿ�
 */ 
abstract class AbsDemo{
	abstract void show();
}

class Outer2{
	int x = 3;
	class Inner2 extends AbsDemo {      //----->��������
		void method(){
			System.out.println("method :" + x);
		}
		@Override
		void show() {
						
		}
	}
	public void function(){
		new Inner2().method();
		new Inner2().show();
		new AbsDemo(){
			@Override
			void show() {
				// TODO Auto-generated method stub
				System.out.println("x="+x);
			}			
		};
	}
	
}


public class InnerClassDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer2().function();
	}

}
