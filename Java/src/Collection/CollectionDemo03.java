package Collection;

import java.util.Enumeration;
import java.util.Vector;
/*ö��Enumeration�ǵ��������е�ȡ������
 * ö�ٺ͵���������
 */
public class CollectionDemo03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Vector v= new Vector();
		v.add("java01");
		v.add("java02");
		v.add("java03");
		v.add("java04");
		
		Enumeration en = v.elements();//ö��
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}

}
