package exe;

public class Compete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(10));
		//��̬�滮���Ѿ�����õ�������洢�������Ժ�ֱ��ȡ��
		
	}

	 static boolean f(int x) {
		// TODO Auto-generated method stub
		 int[] op ={1,3,7,8};
		 for(int i=0 ; i<op.length ;i++){
			 if(x>=op[i]){
				 if(f(x-op[i])==false) return true;//���Ĺ����г��õ��з����Է����䣬���ҷ���Ӯ��
			 }
		 }
		return false;		
	}
}
