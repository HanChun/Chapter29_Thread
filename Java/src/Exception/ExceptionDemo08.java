package Exception;
/*�쳣�����า���е�����----��ʵ��ô�����⣬��Ҫ���ڶ�̬��ʱ������
 * 1�������ڸ��Ǹ���ʱ���������ķ����׳��쳣����ô����ĸ��Ƿ�����
 * ֻ���׳�������쳣���߸��쳣�����ࣻ(��ֹ���ڵĳ����ܲ������ڵ����쳣)
 * 2��������෽���׳�����쳣�������ڸ��Ǹ÷���ʱ��ֻ���׳��ø��෽�����Ӽ�
 * 3�����������߽ӿڵķ�����û���쳣�׳�����ô�����ڸ��Ƿ���ʱҲ�������׳��쳣
 * ������෽���������쳣����ô�ͱ������try-catch�Լ��������Բ����ף�
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
	//�̳к�Ҫô�����쳣��Ҫ�ף���ֻ����ͬ���Ļ�������	
	}
}

public class ExceptionDemo08 {
	public static void main(String[] args){
		Test t = new Test();
		t.function(new Fu());
	}

}

































