package exe;

import java.util.List;

public class MyMenu {
	MyTree tree = new MyTree();
	public void add(String parent,String child){
		tree.add(parent,child);
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
	
	//�����String�������Ӳ˵�
	private String go(String string) {
		
		
		 List<String> lst = tree.getChild(string);
		 for(int i= 0 ;i<lst.size();i++){
			 System.out.println(i + "."+lst.get(i));
		 }
		return "";
	}

}
