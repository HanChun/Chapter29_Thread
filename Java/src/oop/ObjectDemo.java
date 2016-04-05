package oop;

class Demoo{
	private int num;
	Demoo(int num){
		this.num = num;
	}
	public boolean compare(Demoo d){
		return this.num == d.num;
	}	
	public boolean equals(Object obj){  
		if(!(obj instanceof Demoo))
			return false;
		Demoo d  = (Demoo)obj;
		return this.num == d.num ;
	}
}

class BP{
	
}
public class ObjectDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demoo d1 = new Demoo(4);
		Demoo d2 = new Demoo(6);
		Demoo d3 = d1;
		
		System.out.println(d1.equals(d3));
		System.out.println(d1==d2);
		System.out.println(d1==d3);
		System.out.println(d1.compare(d3));
		
		BP p1 = new BP();
		BP p2 = new BP();
		
		System.out.println("person:" + p1.equals(p2));
	}
}
