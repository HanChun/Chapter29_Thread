package Exception;
/*
 * ����ʦ�õ����Ͽ�;
 */ 
class ComputerBule extends Exception{
	ComputerBule(String message){
		super(message);
	}
}
class ComputerBroke extends Exception{
	ComputerBroke(String message){
		super(message);
	}
}
class MaoYanException extends RuntimeException{
	MaoYanException(String message){
		super(message);		
	}
}
class NoPlanException extends Exception{
	NoPlanException(String message){
		super(message);
	}
}

class Computer	{
	private int state = 1; 
	
	public void run() throws ComputerBule, ComputerBroke{
		if(state == 2)
				throw new ComputerBule("������");
		if(state == 3)
				throw new MaoYanException("ð����");
		if(state == 4)
				throw new ComputerBroke("����");
		System.out.println("��������");
	}
	public void reset(){
		state =1;
		System.out.println("��������");
	}
}


class Teacher{
	private String name;
	private Computer cmpt;
	
	Teacher(String name){
		this.name =name;
		cmpt = new Computer();
	}
	
	public void run() throws NoPlanException{
		try {
			cmpt.run();
			System.out.println("����");
		} catch (ComputerBule e) {
			// TODO Auto-generated catch block
			cmpt.reset();
		} catch (ComputerBroke e) {
			dotest();
			throw new NoPlanException("��ʱ�޷�����"+e.getMessage());
			//�����������淢���ˣ����ֱ���׳�ȥ�ˣ��������ִ���ˣ�so dotest()������
		}
		System.out.println("����");
	}
	
	public void dotest(){
		System.out.println("����ϰ�ɡ�����");
	}

}
public class ExceptionDemo05 {
	public static void main(String[] args){
		Teacher t = new Teacher("����ʦ");
		try {
			t.run();
		} catch (NoPlanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�����Ի��߷ż�");
		}
	}
}





















