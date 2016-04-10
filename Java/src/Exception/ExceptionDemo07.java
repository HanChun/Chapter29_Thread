package Exception;
/*第一种格式
 * try{
 * 
 * }catch(){
 * 
 * 
 * }
 * 
 * 第二种格式
 * try{
 * 
 * }catch(){
 * 
 * }finally{
 * 
 * }
 * 
 * 第三种格式
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
		} catch (Exception e) {//有catch就叫作问题解决
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
			//关闭资源或是一定会执行的代码
		}

	}		
}

public class ExceptionDemo07 {

}





