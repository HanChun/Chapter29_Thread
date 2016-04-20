package ClassInfo;
class Candy{
	static{System.out.println("Loading Candy");}
}
class Gum{
	static{System.out.println("Loading Gum");}
}
class Cookie{
	static{System.out.println("Loading Cookie");}
}

public class classDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside main");
		new Candy();
		System.out.println("after creating Candy");
		
		try {
			Class.forName("Gum");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("couldn't find gum ");
		}
		
		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("After creating Cookie");
	}

}
