package ClassInfo;
class A1{int i; String s;}
class B1 extends A1{int j ; float f;}
class C1 extends B1{int k ; B1 b;}
public class classDemo07 {
	public static void Hierarchy(Object o){
		Object[] fields = o.getClass().getDeclaredFields();
		if(fields.length == 0)
			System.out.println(o.getClass()+" has no fields ");		
		if(fields.length>0){
			System.out.println(" Field(s) of " + o.getClass() +":");
			for(Object obj : fields)
				System.out.println(" "+obj);
		}	
		
		if(o.getClass().getSuperclass()!= null ){
			System.out.println(o.getClass() + " is a subclass of " + o.getClass().getSuperclass());
			try {
				Hierarchy(o.getClass().getSuperclass().newInstance());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchy(new C1());
	}
}

























