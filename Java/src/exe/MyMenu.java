package exe;

import java.util.List;

public class MyMenu {
	MyTree tree = new MyTree();
	public void add(String parent,String child){
		tree.add(parent,child);
	}
	public static void main(String[] args) {
		MyMenu m = new MyMenu();
		m.add("水果","苹果");
		m.add("水果","香蕉");
		m.add("水果","葡萄");
		m.add("苹果","红富士");
		m.add("苹果","国光苹果");
		m.add("国光苹果","富强1号");
		m.add("国光苹果","富强2号");
		
		String t = m.go("水果");
		System.out.println("您的选择是： " + t);
	}
	
	//输入此String，进入子菜单
	private String go(String string) {
		
		
		 List<String> lst = tree.getChild(string);
		 for(int i= 0 ;i<lst.size();i++){
			 System.out.println(i + "."+lst.get(i));
		 }
		return "";
	}

}
