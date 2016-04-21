package ClassInfo;

class A{}

class B extends A{}

class C extends B{}

public class ClassDemo06 {
	public static void Hierarchy(Object o){
		
		if(o.getClass().getSuperclass()!=null){
			
			System.out.println(o.getClass() + "is a subclass of" + o.getClass().getSuperclass());
			
			try {
				Hierarchy( o.getClass().getSuperclass().newInstance() );
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
	
	public static void main(Object o) {
		// TODO Auto-generated method stub
		Hierarchy(new C());
	}
}
