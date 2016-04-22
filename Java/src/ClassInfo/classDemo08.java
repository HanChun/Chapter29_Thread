package ClassInfo;

public class classDemo08 {

	public static void main(String[] args) {
		char[] c = new char[10];
		
		System.out.println("Superclass of char[] c: " + c.getClass().getSuperclass());
		System.out.println("char[] c instanceof Object: " + (c instanceof Object));	
	}
}
