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
		 *	o.function(); 这是错的  o里面没有这个引用
		 */
		new Object(){
			public void function(){
				
			}
		}.function();
	}

}
