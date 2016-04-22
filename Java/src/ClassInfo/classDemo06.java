package ClassInfo;

class A{}

class B extends A{}

class C extends B{}

public class classDemo06 {
	public static void Hierarchy(Object o){
		
		if(o.getClass().getSuperclass()!=null){
			//getSuperclass() 是返回上一级的父类
			System.out.println(o.getClass() + " is a subclass of " + o.getClass().getSuperclass());
			
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchy(new C());
	}
}

























