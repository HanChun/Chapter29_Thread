package oop;
class Ff{
	int num=8;
	void method1(){
		System.out.println("fu method_1");
	}
	void method2(){
		System.out.println("fu method_2");
	}
	static void method4()
	{
		System.out.println("fu method_4");
	}
}
class Zz extends Ff{
	int num =5;
	void method1(){
		System.out.println("zi method_1");
	}
	void method3(){
		System.out.println("zi method_3");
	}
	static void method4()
	{
		System.out.println("zi method_4");
	}
}
public class DuoTaiDemo02 {
	public static void main(String[] args){
		Zz z = new Zz();
		z.method1();
		z.method2();
		z.method3();
		 
		Ff f = new Zz();
		System.out.println(f.num); //8
		Zz zd = new Zz();
		System.out.println(zd.num);//5
		
		f.method1();//zi һ
		f.method2();//fu ��
		//f.method3();//����ʧ�ܣ�˵�Ҳ���method3����
		
		Ff ff = new Zz();
		ff.method4();//Ff��
		
	}
}
/*�ڶ�̬��[�Ǿ�̬�� ��Ա����]���ص㣺
*�ڱ���ʱ�ڣ����������ͱ��������������Ƿ��е��õķ������У�ͨ����
*������ʱ�ڣ����Ķ��������������Ƿ��е��õķ�����
*���ܽ���ǣ���Ա�������ڶ�̬����ʱ�����뿴��ߣ����п��ұߣ�
*�������е����Լ��ģ�����û�еķ��ʸ��ࣩ
*
*�ڶ�̬��[��̬��Ա����]���ص㣺
*���۱�������У����ο���ߣ������ͱ����������ࣩ��--->��Ϊ��̬��������Ҫ����
*
*�ڶ�̬��[��Ա����]���ص㣺
*���۱�������У����ο���ߣ������ͱ����������ࣩ��
*/
