package oop;
/*
 * ��class�Ͷ���new��Ĺ�ϵ
 * 
 * ��Ա����������������
 * �ֲ������������ں����л������
 * 
 * ���ڴ��е�λ��
 * ��Ա�������ڶ��ڴ��У���Ϊ����Ĵ��ڣ������ڴ��д��ڣ�----�䶼��Ĭ��ֵ����ΪҪ��������
 * �ֲ�������������ջ�ڴ���							-----����ʼ���ǲ����ܲ��������
 * 
 * ���������д�����������������������newһ���Լ������ڱ����д����������
 */
public class Demo01 {
	public static void main(String[] args) {
		
		Car c = new Car();
		c.num = 5;
		
		//��������
		new Car().num =5;
		new Car().color = "blue";
		new Car().run();
		
		Car q = new Car();
		show(q);
		
		//����������ʱ�����ö���������
		//ǿ���ã������ã������ã������ã��漰�����ʱ��
		q=null;
		
	}
	
	//�����������䳡�������������޸ģ������ĳ��ĳɺڳ���������̥��
	public static void show(Car c){
		c.num = 3;
		c.color ="black";
		c.run();
	}
}

	class Car{
		int num;
		String color;
		void run(){}
	}
