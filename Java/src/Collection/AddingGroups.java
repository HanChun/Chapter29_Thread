package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class AddingGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer[] moreInts = {6,7,8,9,10};//数组
		collection.addAll(Arrays.asList(moreInts));//传入的对象需要是collection类型
	}
}


























