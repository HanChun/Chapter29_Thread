package ReflectApp;

public class NoteBook {
	public void run(){
		System.out.println("notebook run");
	}
	
	public void useUSB(USB usb){
		if(usb!=null){
			usb.open();
			usb.close();
		}
	}

	
}
