package oop;

		interface A{
			void methodA();
		}
		interface B extends A{
			void methodB();
			
		}
		interface C extends B{
			void methodC();
		}
		
		//�ӿ�֮����Զ�̳�,��Ϊû�з�����
		interface D extends B,A{
			
		}
		
	class E implements C{
		
			@Override
			public void methodB() {
				// TODO Auto-generated method stub
				
			}
		
			@Override
			public void methodA() {
				// TODO Auto-generated method stub
				
			}
		
			@Override
			public void methodC() {
				// TODO Auto-generated method stub
				
			}
			
		}
		
		public class InterfaceDemo01 {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		
			}
		
		}
