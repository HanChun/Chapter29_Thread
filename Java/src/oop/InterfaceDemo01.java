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
		
		//接口之间可以多继承,因为没有方法体
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
