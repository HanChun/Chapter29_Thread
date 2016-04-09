package Exception;
class Demo01{
	int div(int a, int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{
		//两个错误不可能同时出现，函数之中只要有异常发生，函数就结束
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
		}catch(Exception e){//--->他全能干的原因是多态性
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
























