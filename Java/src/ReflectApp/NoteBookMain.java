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
		
		//ͨ������ķ�ʽ�������Ӧ�ó�������߸��õ���չ��
		File configFile = new File("tempfile\\usb.properties");
		if(!configFile.exists()){
			configFile.createNewFile();
		}
		//��ȡ�����ļ�
		FileReader fr = new FileReader(configFile);
		//Ϊ�˻�ȡ��ֵ��Ϣ���㣬����Properties
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



















