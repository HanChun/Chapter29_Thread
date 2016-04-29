package exe;

import java.util.ArrayList;
import java.util.List;

public class MyTree {
	private List<Node> lst = new ArrayList<Node>();
	
	class Node{
		String data;
		String parent;
	}

	public List<String> getChild(String parent) {
		// TODO Auto-generated method stub
		List<String> t = new ArrayList<String>();
		/*System.out.println("nihao");
		System.out.println(t.size());*/
		for(int i = 0 ; i<lst.size() ; i++){
			if(lst.get(i).parent.equals(parent)){
				t.add(lst.get(i).data);
			}
		}
		return t;
	}


	public String getParent(String string) {
		// TODO Auto-generated method stub
		for(int i =0 ; i<lst.size() ; i++){
			if(lst.get(i).data.equals(string))
				return lst.get(i).parent;
		}
		return null;
	}

	public void add(String parent, String data) {
		// TODO Auto-generated method stub
		Node t = new Node();
		t.data = data;
		t.parent = parent;
		lst.add(t);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTree a = new MyTree();
		
		a.add("����","����");
		a.add("����","ŷ��");
		a.add("����","����");
		
		a.add("����","�й�");
		a.add("����","�й�");
		a.add("����","�й�");
		
		a.add("�й�","����");
		a.add("�й�","�ӱ�");
		a.add("�й�","����");
		//System.out.println(a);
		System.out.println(a.getParent("�ӱ�"));
		System.out.println("------------");
		System.out.println(a.getChild("�й�"));
	}
}














