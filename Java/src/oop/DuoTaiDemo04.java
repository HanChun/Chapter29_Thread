package oop;
/*程序拓展的示例
 * 
 * 需求：数据库的操作
 * 1、连接数据库JDBC 
 * 2、操作数据库 
 * 3、关闭数据库连接
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
		//代表主程序和操作数据库连接的方式的耦合性，太强(总  要改，不好)
		
		UserInfoDao ui = new UserInfoByJDBC();
		ui.add(u);
		ui.delete(u);
	}

}
