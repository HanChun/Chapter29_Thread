package Exception;
/*Exception����һ������������쳣RuntimeException����ʱ�쳣
 * ����ں������׳����쳣�������Ͽ��Բ�������������һ��ͨ����
 * ����ں����������˸��쳣�������߿��Բ��ô�������һ��ͨ��
 * 
 * ֮���Բ����ں���������������Ϊ����Ҫ�����ߵĴ���
 * ����ϣ���ڴ�runtimeException����ʱ������ֹͣ��ϣ��ֹͣ����󣬳���Ա�Դ������������
 */
class Demo03{
	int div(int a, int b) throws ArithmeticException{
		/*if (b==0)
			throw new ArithmeticException("�������") ;*/
		// throw new Exception;  ��������Ļ������ϱ���Ҫ��������������º��������쳣�����϶�Ҫ����һ�£�
		return a/b;
	}
}

public class ExceptionDemo03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo03 d = new Demo03();
		
		int x = d.div(4, 0);
		System.out.println("x= " + x );
		
		System.out.println("over");
		
	}
}




