package oop;

public class StaticDemo04 {

	public static void main(String[] args) {
		P p =new P("zhangsan",20);
		/**
		 * 1����Ϊnew�õ���person.class�ļ������Ի����ҵ�Person.class�ļ������ص��ڴ棻
		 * 2��ִ�и����еľ�̬����飬����еĻ�����Person.class����г�ʼ��
		 * 3���ڶ��ڴ��п��ٿռ䣬�����ڴ��ַ
		 * 4���ڶ��ڴ��н���������������ԣ�������Ĭ�ϳ�ʼ��
		 * 5�������Խ�����ʾ��ʼ��
		 * 6���Զ�����й��������ʼ��
		 * 7���Զ��������֮��Ӧ�Ĺ��캯����ʼ��
		 * 8�����ڴ��ַ����ռ�ڴ��е�p����
		 */
	}
}

class P{
	private String name="hello";//-----
	private int age;
	
	private static String country ="cn";
	P(String name,int age){
		this.name = name;
		this.age = age;
	}
	{
		System.out.println(name+"..."+age);//-----
	}
	public void setName(String name){
		this.name = name;
	}
	public void speak(){
		System.out.println(this.name +".."+this.age);
	}
	public static void showCountry(){
		System.out.println("country=" + country);
	}
	static{
		System.out.println("hehe");
	}
}
