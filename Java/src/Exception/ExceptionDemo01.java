package Exception;
class Demo01{
	int div(int a, int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{
		//�������󲻿���ͬʱ���֣�����֮��ֻҪ���쳣�����������ͽ���
		int[] arr = new int[a];
		System.out.println(arr[4]);
		return a/b;
	}
}

public class ExceptionDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo01 d = new Demo01();
		try {
			int x = d.div(4, 0);
			System.out.println("x="+x);
		}catch(Exception e){//--->��ȫ�ܸɵ�ԭ���Ƕ�̬��
			System.out.println("haha......"+e.toString()); 
		} 
		/*catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.toString());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}*/
		
		
		System.out.println("over");
	}

}
























