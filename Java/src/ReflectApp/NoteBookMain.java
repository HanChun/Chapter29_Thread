package ReflectApp;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class NoteBookMain {

	public static void main(String[] args) throws Exception {

		NoteBook book = new NoteBook(); 
		/*
		book.run();
		book.useUSB(null);
		book.useUSB(new MouseByUSB());*/
		
		//通过反射的方式重新设计应用程序，以提高更好的拓展性
		File configFile = new File("tempfile\\usb.properties");
		if(!configFile.exists()){
			configFile.createNewFile();
		}
		//读取配置文件
		FileReader fr = new FileReader(configFile);
		//为了获取键值信息方便，建立Properties
		Properties prop = new Properties();
		prop.load(fr);
		
		for(int x = 1; x<=prop.size(); x++){
			 String className = prop.getProperty("usb"+x);
			 Class clazz = Class.forName(className);
			 USB usb = (USB)clazz.newInstance();
			 book.useUSB(usb);			 
		}		
		fr.close();
	}
}



















