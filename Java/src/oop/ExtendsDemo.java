package oop;
/**���˼̳��Ժ���ؾͱ�ò�һ����
 * this�������������
 * super��������������
 */
class Fu{
	int num = 4;
}
class Zi extends Fu{
	int num = 5;
	
	void show(){
		System.out.println(num);//this.num
		System.out.println(super.num);//��ʱΪ����ģ�����Ҳ�г��ࣩ
	}
}
public class ExtendsDemo {

	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();

	}

}
