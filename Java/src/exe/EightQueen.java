package exe;

public class EightQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[8];//��ʾ���̣�a[i]��ʾÿһ�У�
		f(a,0);  
	}
	//����row������col
	private static boolean check(int[] a, int row,int col) {
		for(int i=0 ; i<row ; i++){
			//�����ϵĳ�ͻ
			if(col==a[i]) return false;
			
			//�Խ��߼��飺����������в������в�࣬����ڶԽ�����
			if(row-i == Math.abs(a[i]-col))  return false;
		}
		return true;
	}
	//������a�з��õ�k���ʺ�,Ҳ�����k��
	private static void f(int[] a, int k) {
		// TODO Auto-generated method stub
		if(k==8){
			show(a);
			return;
		}
		for(int i=0 ; i<8 ;i++){
			a[k]=i;//��ʾ�Ե�k����һ���Դ�0��7��8��λ��
			
			//��a�����е�k��(��)�ʺ����λ��i�����м��
			if(check(a,k,i)){
				f(a,k+1);
			}
		}
	}
	private static void show(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0; i<a.length ;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}



}
