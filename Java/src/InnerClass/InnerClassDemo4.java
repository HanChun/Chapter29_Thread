package InnerClass;
/*�����ڲ��ࣺ
 * 1�������ڲ�����ʵ�����ڲ���ļ�дģʽ
 * 2�����������ڲ����ǰ�᣺
 * 		�ڲ�������Ǽ̳�һ�������ʵ�ֽӿ�
 * 3�������ڲ���ĸ�ʽ�� new��������ǽӿڣ���{
 * �������������}��
 * 4����ʵ�����ڲ������һ�������������
 * �ǰѶ�����ͽ��������װΪһ��ı�����ʽ��������������е��֣�
 * 
 * �����ڲ����ʹ�ã����Ǽ���д���Ƿ�����
 * 5�������ڲ���ķ�����ò�Ҫ����3��
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
				}
			void abc(){
				System.out.println("haha");
				}
			}.show();
			
		/*new AbsDemo(){
			@Override
			void show() {
				// TODO Auto-generated method stub
				System.out.println("x="+x);
			}			
		};*/
			
			//��������ָ�����������Ϊ�������ķ�����д��
			AbsDemo d = new AbsDemo(){
				int num = 9;
				void show() {					
					System.out.println("num==="+num);
				}
				void abc(){
					System.out.println("haha");
				}				
			};
			
			d.show();
			//d.abc();��������ôд��������û�ж����
	}
	
}


public class InnerClassDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer2().function();
	}

}
