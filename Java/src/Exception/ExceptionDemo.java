package Exception;
/*�쳣�����ǳ���������ʱ���ֵĲ����������
 *�쳣������������Ҳ����ʵ������һ����������� ������ͨ��java����ʽ��������������װ�ɶ���
 *��������Ļ��֣����֣�
 *һ�������صģ�һ���Ƿ����ص�
 *�������ص����⣬javaͨ��Error��������������
 *	����Errorһ�㲻��д����ԵĴ��������д���//�ⲿ����������������
 *���ڷ����صģ�javaͨ��Exception��������
 *	����Exception����ʹ������ԵĴ���ʽ���д���
 *
 *Throwable
 *		|--Error
 *		|--Exception
 *
 *2���쳣�Ĵ���
 *
 *3���Բ��񵽵��쳣���г�����������
 *		String getMessage():��ȡ�쳣����Ϣ
 */
class Demo{
 	int div(int a, int b) throws Exception//�ڹ�����ͨ��throws�Ĺؼ��������˸ù����п��ܻ��������
 								//���Ǳ�ǣ��Ǳ�д���ܵ��˱��һ�´˹��ܣ�����ʹ���ߣ���������ܻ������⣬
 								//��ʹ�õ�ʱ��Ҫ����һ��,������������ͱ���ʧ��
 	 {
		return a/b;
	}
}
public class ExceptionDemo {
	public static void main(String[] args)throws Exception {//��ô�׳����׳����������
		
		Demo d = new Demo();
		/*try {
			int x = d.div(4, 0);
			System.out.println("x=" +x);
		} catch (Exception e) {	//Exception e = new ArithmeticException();//�ڹ���������ʲô�㴦��ʲô
			System.out.println("������");
			System.out.println(e.getMessage());// by zero
			System.out.println(e.toString());
			e.printStackTrace(); //�쳣��Ϣ �쳣���� �쳣���ֵ�λ��
			//��ʵjvmĬ�ϵ��쳣������ƣ������ڵ���printStrackTrace����
		}
*/		
		int x = d.div(4, 0);
		System.out.println("x=" +x);
		
		System.out.println("over");
	}
}



















