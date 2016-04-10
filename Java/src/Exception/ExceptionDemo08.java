package Exception;
/*异常在子类覆盖中的体现----其实这么多问题，主要是在多态的时候会出现
 * 1、子类在覆盖父类时，如果父类的方法抛出异常，那么子类的覆盖方法，
 * 只能抛出父类的异常或者该异常的子类；(防止早期的程序不能产生后期的新异常)
 * 2、如果父类方法抛出多个异常，子类在覆盖该方法时，只能抛出该父类方法的子集
 * 3、如果父类或者接口的方法中没有异常抛出，那么子类在覆盖方法时也不可以抛出异常
 * 如果子类方法发生了异常，那么就必须进行try-catch自己处理，绝对不能抛；
 */
class AException extends Exception{
	
}
 
class BException extends AException{
	
}

class Fu{
	void show() throws AException{
		
	}
}

class Test{
	void function(Fu f){
		try {
			f.show();
		} catch (AException e) {
			e.printStackTrace();
		}
	}
}

class Zi extends Fu{
	void show() throws AException{
	//继承后，要么不抛异常，要抛，就只能抛同样的或其子类	
	}
}

public class ExceptionDemo08 {
	public static void main(String[] args){
		Test t = new Test();
		t.function(new Fu());
	}

}

































