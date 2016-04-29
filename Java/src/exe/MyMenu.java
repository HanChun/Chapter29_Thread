package exe;

import java.util.List;
import java.util.Scanner;

public class MyMenu {
	MyTree tree = new MyTree();
	public void add(String parent,String child){
		tree.add(parent,child);
	}
	
	
	//输入此String，进入子菜单
	private String go(String string) {
		 Scanner scan = new Scanner(System.in);	
		
		while(true){		 
			 List<String> lst = tree.getChild(string);
			 if( lst.isEmpty() ) {
				 return string;
			 }
			 System.out.println("---------------------------");
			 for(int i= 0 ;i<lst.size();i++){
				 System.out.println(i + "."+lst.get(i));
			 }
			 System.out.println("u.返回上一级");
			 System.out.println("----------------------------");
			 System.out.print("输入选择");
			 
			 String s = scan.nextLine();
			 if(s.equals("u")){ 
				 String x1 = tree.getParent(string);
				 if(x1!=null) string = x1;
				 continue; 
			 }
			 try{
				 string= lst.get(Integer.parseInt(s));
			 }catch(Exception e){
				 System.out.println("请重新选择！！");
			 }
		 }

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
}
