package ClassInfo;

import java.util.Arrays;
import java.util.List;

abstract class Shape{
	void draw(){
		System.out.println(this );
	}
	abstract public String toString();
}
class Circle extends Shape{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle";
	}	
}
class Square extends Shape{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Square";
	}	
}
class Triangle extends Shape{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Triangle";
	}	
}
	
public class classDemo01 {
	public static void rotate(Shape s){
		if(s instanceof Circle)
			((Circle)s).draw();
		else if(!(s instanceof Circle))
			System.out.println("a is not a Circle");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> shapeList = Arrays.asList(new Circle(),new Square(),new Triangle());
		for(Shape shape: shapeList)
			shape.draw();
		
		Triangle t = new Triangle();
		//((Shape)t).draw();
		Shape a = (Shape)t;
		a.draw();
		
		//Circle c = (Circle)a;//java.lang.ClassCastException: ClassInfo.Triangle cannot be cast to ClassInfo.Circle
							   //at ClassInfo.classDemo01.main(classDemo01.java:47)
		if(a instanceof Circle)
			((Circle)a).draw();
		else if(!(a instanceof Circle))
			System.out.println("a is not a Circle");
	}
}



























