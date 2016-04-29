package exe;

import java.util.List;
import java.util.Scanner;

public class MyMenu {
	MyTree tree = new MyTree();
	public void add(String parent,String child){
		tree.add(parent,child);
	}
	
	
	//�����String�������Ӳ˵�
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
			 System.out.println("u.������һ��");
			 System.out.println("----------------------------");
			 System.out.print("����ѡ��");
			 
			 String s = scan.nextLine();
			 if(s.equals("u")){ 
				 String x1 = tree.getParent(string);
				 if(x1!=null) string = x1;
				 continue; 
			 }
			 try{
				 string= lst.get(Integer.parseInt(s));
			 }catch(Exception e){
				 System.out.println("������ѡ�񣡣�");
			 }
		 }

	}
	
	public static void main(String[] args) {
		MyMenu m = new MyMenu();
		m.add("ˮ��","ƻ��");
		m.add("ˮ��","�㽶");
		m.add("ˮ��","����");
		m.add("ƻ��","�츻ʿ");
		m.add("ƻ��","����ƻ��");
		m.add("����ƻ��","��ǿ1��");
		m.add("����ƻ��","��ǿ2��");
		
		String t = m.go("ˮ��");
		System.out.println("����ѡ���ǣ� " + t);
	}
}
