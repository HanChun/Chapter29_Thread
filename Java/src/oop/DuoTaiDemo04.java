package oop;
/*������չ��ʾ��
 * 
 * �������ݿ�Ĳ���
 * 1���������ݿ�JDBC 
 * 2���������ݿ� 
 * 3���ر����ݿ�����
 */
class User{
	
}

class UserInfoByJDBC{
	public void add(User user){
		
	}
	
	public void delete(User user){
		 
	}
}

class UserInforByHibernate{
	public void add(User user){
		
	}
	
	public void delete(User user){
		 
	}
	
}
public class DuoTaiDemo04 {
	public static void main(String[] args) {
		User u = new User();
		UserInfoByJDBC ui = new UserInfoByJDBC();
		//UserInforByHibernate uih = new UserInforByHibernate();
		//����������Ͳ������ݿ����ӵķ�ʽ������ԣ�̫ǿ(��Ҫ�ģ�����)
		ui.add(u);
		ui.delete(u);
	}

}
