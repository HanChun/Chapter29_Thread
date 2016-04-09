package Exception;
/*
 * 防止NullPointerException
 * 
 * 关于RuntimeException;
 * 自定义异常时，如果该异常发生时，就无法继续进行运算，就让自定义异常继承RuntimeException;
 */
class FuShuException extends RuntimeException{
	FuShuException(String msg){
		super(msg);
	}
}

class Demo04{
	int div(int a, int b){
		if(b<0)
			throw new FuShuException("出现了除数为负数");
		if(b==0)
			throw new ArithmeticException("被零除了");
		return a/b;
	}
}


class Person{
	public void checkName(String name){
		//if(name.equals("lisi"))//NullPointerException
		if("lisi".equals(name))//if(name!=null && name.equals("lisi"))左面是假
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}