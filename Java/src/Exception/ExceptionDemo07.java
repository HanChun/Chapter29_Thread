package Exception;
/*��һ�ָ�ʽ
 * try{
 * 
 * }catch(){
 * 
 * 
 * }
 * 
 * �ڶ��ָ�ʽ
 * try{
 * 
 * }catch(){
 * 
 * }finally{
 * 
 * }
 * 
 * �����ָ�ʽ
 * try{
 * 
 * }finally{
 * 
 * 
 * }
 * 
 */

class Demo07{
	public void method() throws Exception{
		/*try {
			throw new Exception();
		} catch (Exception e) {//��catch�ͽ���������
				try {
					throw e;
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
	}*/
		try{
			throw new Exception();
			}
		finally
		{
			//�ر���Դ����һ����ִ�еĴ���
		}

	}		
}

public class ExceptionDemo07 {

}





