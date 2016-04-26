package exe;
//BiTree是二叉树的一个节点
public class BiTree {
	private int data;
	private BiTree left;
	private BiTree right;
	public BiTree(int x){
		this.data = x;
	}
	public void add(BiTree t){
		if(this.data>t.data){
			if(left==null)
				left = t;
			else 
				left.add(t);
		}else{
			if(right==null)
				right = t;
			else
				right.add(t);
		}
	}
	
	public void travel(){
		if(left!=null)
			left.travel();
		System.out.println(this.data);
		if(right!=null)
			right.travel();
		
	}

}


















