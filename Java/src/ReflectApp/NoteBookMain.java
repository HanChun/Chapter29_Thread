package ReflectApp;

import java.io.File;

public class NoteBookMain {

	public static void main(String[] args) {

	/*	NoteBook book = new NoteBook(); 
		book.run();
		book.useUSB(null);
		book.useUSB(new MouseByUSB());*/
		
		//通过反射的方式重新设计应用程序，一提高更好的拓展性
		File configFile = new File("tempfile\\usb.properties");
		
		
	}
}
