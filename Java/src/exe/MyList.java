package exe;

public class MyList {
	private int data;
	private MyList next;
	public MyList(int x){
		data = x;
	}
	public void add(MyList x){
		x.next = next;
		this.next = x.next;
	}
	public void append(MyList x){
		MyList p = this;
		while(p.next != null){
			p = p.next;
		}
		p.next = x;
	}
	public void show(){
		MyList p = this;
		while(p.next!=null){
			System.out.println(p.data);
			p = p.next;
		}
	}

}
