package Collection;

import java.util.ArrayList;

public class CollectionDemo04 {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i = 0 ; i<3 ; i++)
			apples.add(new Apple());
		//apples.add(new Orange());
		for(Apple c : apples)//取出时也不需要转型了
			System.out.println(c.id());
	}

}
