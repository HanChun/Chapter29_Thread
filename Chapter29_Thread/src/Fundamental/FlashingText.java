package Fundamental;

import javax.swing.JApplet;
import javax.swing.JLabel;
//�ҵ��������������Ƿ����newһ�£���ֱ�ӵ�������ķ���
public class FlashingText extends JApplet implements Runnable {
	private JLabel jlblText = new JLabel("welcome",JLabel.CENTER); 
	
	public FlashingText() {
		add(jlblText);
		new Thread(this).start();		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true){
				if(jlblText.getText() == null)
					jlblText.setText("welcom");
				else 
					jlblText.setText(null);
				
					Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
