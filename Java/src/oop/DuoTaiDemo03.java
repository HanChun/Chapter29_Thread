package oop;
//����������ԣ�����˹�����չ�ԣ��ṩ�˹���	
interface PCI{
		public void open();
		public void close();
	}

	class MainBoard{
		public void run(){
			System.out.println("mainboard run");   
		}
/*	
 * public void useNetCard(NetCard c){
		c.open();
		c.close();
	}
*/
	public void usePCI(PCI p){//PCI p = new NetCard()  �ӿ�������ָ���Լ����������
		if(p!=null){
			p.open();
			p.close();
		}
	}
}

	class NetCard implements PCI{
		public void open(){
			System.out.println("netcard open");
		}
		public void close(){
			System.out.println("netcard close");
		}
	}
	
public class DuoTaiDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainBoard mb = new MainBoard();
		mb.run();
		mb.usePCI(null);
		//mb.useNetCard(new NetCard());
		mb.usePCI(new NetCard());
	}

}
