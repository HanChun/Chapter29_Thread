package InnerClass;
/*�ڲ���ķ��ʹ���
 * 1���ڲ������ֱ�ӷ����ⲿ���еĳ�Ա������˽�У�
 * 		֮���Կ���ֱ�ӷ����ⲿ���еĳ�Ա������Ϊ�ڲ����г�����һ���ⲿ�������
 * 2���ⲿ��Ҫ�����ڲ��࣬�����롿�����ڲ�����
 * 
 * 3�����ⲿ�������У����ֱ�ӷ���static�ڲ���ķǾ�̬��Ա�أ�
 * 		new Outer.Inner().function();
 * 	���ⲿ�������У����ֱ�ӷ���static�ڲ����static��Ա�أ�
 * 		Outer.Innerrr.func();
 * 
 * ע�⣺���ڲ����ж����˾�̬��Ա�����ڲ�������Ǿ�̬��
 * ���ⲿ���еġ���̬�����������ڲ���ʱ���ڲ���Ҳ�����Ǿ�̬��
 */
class Outer{
	private int x = 3;
	private static int y =3;
	//�ڲ��� �ô�������class Inner ����Outer���еı���
	class Inner{
		//�ڲ�����Ա�˽�����Σ����ڲ������ⲿ��ĳ�Ա��λ���ϵ�ʱ��
		int x = 4;//�ڲ���Ա
		void function(){
			int x = 6 ;//�ڲ��ֲ���Ա
			System.out.println("Inner : "+x);//---->6
			System.out.println("Inner : "+this.x);//---->4
			System.out.println("Inner : "+ Outer.this.x);//---->5 �˴��ǳ���Ҫ
		}
	}
	
	private class Innerr{
		//�ڲ�����Ա�˽�����Σ����ڲ������ⲿ��ĳ�Ա��λ���ϵ�ʱ��
		void function(){
			System.out.println("Inner : "+x);
		}
	}
	
	static class Innerrr{
		//��̬�ڲ���,���ڲ��౻static���κ�ֻ��ֱ�ӷ����ⲿ���е�static��Ա
		void function(){
			System.out.println("inner : " + y);
		}
		static void func(){
			System.out.println("inner : " + y);
		}		
	}
	
	class Inner2{
		void show(){
			System.out.println("inner2 show");
		}
	}
	public static void method1(){
		Innerrr.func();
	}
	
	void method(){
		Inner in = new Inner();
		in.function();
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.method();
		
		//�½�inner����ʱ��һ��Ҫ��ʶ����inner������һ���ⲿ��
		//��Ϊ�п����в�ͬ���ⲿ�࣬ͬʱ���н���inner���ڲ���
		Outer.Inner in= new Outer().new Inner();
		in.function();
		
		new Outer.Innerrr().function();//���ʾ�̬�ڲ���ķ���
		
		Outer.Innerrr.func();//���ʾ�̬�ڲ����еľ�̬��������new������Ҫ������
		
	}
}
