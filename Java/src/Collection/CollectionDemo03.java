package Collection;

import java.util.Enumeration;
import java.util.Vector;
/*枚举Enumeration是迭代器特有的取出方法
 * 枚举和迭代器很像
 */
public class CollectionDemo03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Vector v= new Vector();
		v.add("java01");
		v.add("java02");
		v.add("java03");
		v.add("java04");
		
		Enumeration en = v.elements();//枚举
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}

}
