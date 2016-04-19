package Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * treeMap（是可以排序的map集合）
 * 对学生的年龄进行升序的排序 
 */
class StuNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		int num = s1.getName().compareTo(s2.getName());
		if(num==0)
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
		return num;
	}
	
}
public class MapDemo04 {
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<Student,String>(new StuNameComparator());
		tm.put(new Student("lisi1",21), "beiJing");
		tm.put(new Student("lisi2",22), "shanghai");
		tm.put(new Student("lisi3",23), "nanjing");
		tm.put(new Student("lisi4",24), "wuhan");
		
		Set<Map.Entry<Student,String>> entrySet=tm.entrySet();
		Iterator<Map.Entry<Student,String>> it = entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<Student, String> me = it.next();
			
			Student stu = me.getKey();
			String add = me.getValue();
			System.out.println(stu+":::"+add);
		}
		
	}
}
