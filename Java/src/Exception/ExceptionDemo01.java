package Exception;
/*
 * �Զ��쳣�Ĵ���
 * 1�������쳣ʱ������������Ϊ������쳣���������Դ���ĸ�Ϊ����
 * 2���Է����������쳣��Ӧ�ö�Ӧ����catch�飻��Ҫ��������catch��
 * 		������catch���е��쳣���ּ̳й�ϵ�������쳣catch�����������
 * 
 * �����ڽ���catch����ʱ��catch��һ��Ҫ�������Ĵ���ʽ����Ҫ�򵥵Ķ���һ��e.printStackTrace()
 * Ҳ��Ҫ�򵥵ľ���дһ�������䣻
 */
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
			//������ô�������ã���Ϊ��������������ܿ�������������Ҳ�����ִ�У��㲢��֪����μ���������ȥ��
			//���ʱ��������ֶԷ�����֮��������Ӧ�ðѳ���ͣ������Ϊ������Ҫ֪�������򵽵������￨ס�ˣ�����������ͣס�ˣ�����Ӧ��������������
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

/*
 * �������쳣������ʱ�������ǲ���ӡ�ģ����ǻ���Ӳ�̵��ļ���¼������
 * ----->�쳣��־�ļ�
 */






















