package ClassInfo;

interface HashBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
	Toy(){}
	Toy(int i){}
}
class FancyToy extends Toy implements HashBatteries,Waterproof,Shoots{
	FancyToy(){super(1);}
}

public class classDemo03 {
	static void printInfo(Class cc){
		System.out.println("Class name : " + cc.getName() + " Is interface? [" + cc.isInterface() +"]");
		System.out.println( cc.getSimpleName() +"    ++++++  "+ cc.getCanonicalName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = null;
		try {
			c=Class.forName("ClassInfo.FancyToy");//������һ��class�����ã�ָ��FancyToy
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("can't find FancyToy");
			System.exit(1);
		}
	
		 printInfo(c);	
		 System.out.println("------------------------------");
		//ȡ����cʵ�ֵĽӿ�
		 for(Class face:c.getInterfaces())
			printInfo(face);
		 System.out.println("------------------------------");
		
		Class up = c.getSuperclass();//���ػ���
		printInfo(up);
		System.out.println("--------------------------------");
		
		Object obj = null;//��ʱobj�Ƕ����ˣ��Ͳ���class��		
		try {
			obj = up.newInstance();
		} catch (InstantiationException e) {
			System.out.println("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("Cannot exit");
			System.exit(1);
		}	
		System.out.println(obj.getClass());
		
	}
}










