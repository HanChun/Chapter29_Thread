package oop;
//降低了耦合性，提高了功能拓展性，提供了规则	
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
	public void usePCI(PCI p){//PCI p = new NetCard()  接口型引用指向自己的子类对象
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
