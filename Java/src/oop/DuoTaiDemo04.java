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
interface UserInfoDao{
	public void add(User user);
	public void delete(User user);
}

class UserInfoByJDBC implements UserInfoDao{
	public void add(User user){
		
	}
	
	public void delete(User user){
		 
	}
}

class UserInforByHibernate implements UserInfoDao{
	public void add(User user){
		
	}
	
	public void delete(User user){
		 
	}
	
}
public class DuoTaiDemo04 {
	public static void main(String[] args) {
		User u = new User();
		//UserInfoByJDBC ui = new UserInfoByJDBC();
		//UserInforByHibernate uih = new UserInforByHibernate();
		//����������Ͳ������ݿ����ӵķ�ʽ������ԣ�̫ǿ(��  Ҫ�ģ�����)
		
		UserInfoDao ui = new UserInfoByJDBC();
		ui.add(u);
		ui.delete(u);
	}

}
