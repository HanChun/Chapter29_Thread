package oop;

//����������ʱ�ų�ʼ����Ҳ�����������ʱ���أ���Ϊ������ʽ
class Sing{
	private static Sing s=null;
	private Sing(){
		
	}
	public static Sing getInstance(){
		if(s==null){
			synchronized(Single.class)//�������Ϳ������Ч��
			{
				if(s==null)
					s=new Sing();
			}
		}
		return s;
	}
}


public class SingleDem02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
