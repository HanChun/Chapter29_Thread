package InnerClass;

public class InnerTest07 {
	
/*	
 * static class Inner{
		void function(){
			
		}
	}
*/
	
	public static void main(String[] args) {
		//new Inner().function();
		
		/*
		 * Object o = new Object(){
		 *	public void function(){
		 *		System.out.println("hahahaha....");
		 *		}
		 *	};
		 *	o.function(); ���Ǵ��  o����û���������
		 */
		new Object(){
			public void function(){
				
			}
		}.function();
	}

}
