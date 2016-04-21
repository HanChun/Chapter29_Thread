package ClassInfo;
class Candy1
{
	static{ System.out.println("Loading Candy");}
}
class Gum1
{
	static{ System.out.println("Loading Gum");}
}
class Cookie1
{
	static{ System.out.println("Loading Cookie");}
}

public class SweetDemo05 {
	public static void main(String[] args) {
		if(args.length<1){
			System.out.println("Usage:sweetName");
			System.exit(0);
		}
		Class c = null;
		
		try {
			c=Class.forName(args[0]);
			System.out.println(" Enjoy your " + args[0]);
		} catch (ClassNotFoundException e) {
			System.out.println(" Couldn't find " + args[0]);
			e.printStackTrace();
		}
				
	}
}
