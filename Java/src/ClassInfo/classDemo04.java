package ClassInfo;

import java.util.Arrays;
import java.util.List;

abstract class Shape1{
	void draw(){System.out.println(this + ".draw()");}
	abstract public String toString();
}
class Circle1 extends Shape1{
	boolean flag = false;
	@Override
	public String toString() {
		return (flag?"H":"Unh") + " ighlighted "+" Cirle1 ";
	}	
}
class Square1 extends Shape1{
	boolean flag = false;
	@Override
	public String toString() {
		return (flag?"H":"Unh") + " ighlighted " +"Square1";
	}	
}
class Triangle1 extends Shape1{
	boolean flag = false;
	@Override
	public String toString() {
		return (flag?"H":"Unh") + " ighlighted "+"Triangle1";
	}	
}


public class classDemo04 {
	public static void setFlag(Shape1 s){
		if(s instanceof Triangle1)
			((Triangle1)s).flag=true;
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape1> shapeList = Arrays.asList(
			new Circle1(),new Square1(),new Triangle1()
		);
		for(Shape1 shape1 : shapeList){
			setFlag(shape1);
			System.out.println(shape1);
		}	
	}
}
