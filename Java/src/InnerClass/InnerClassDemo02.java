package InnerClass;
/*һ���ڲ����ǲ��ᱻ�������ε�
 * 
 * �ڲ��ඨ���ھֲ�ʱ��
 * 1�������Ա���Ա���η����� e.g. static
 * 2������ֱ�ӷ����ⲿ���еĳ�Ա,��Ϊ�������ⲿ���е����á�
 * ���ǲ����Է��������ڵľֲ��еı�����ֻ�ܷ��ʱ�final���εľֲ�����
 * 
 */
class Out{
	int x = 3 ;
	void method(){
		//��ʱin�Ǿֲ����ࣻͬʱע�⣬method�����в��ܶ���static��
		//��Ϊstatic�ǳ�Ա���η�
		
		final int y = 4;
		class In{ 
			void function(){
				System.out.println(Out.this.x);
				System.out.println(y);//�ڲ�����Ҫ���ʾֲ���������ֵӦ�÷��ʳ�final
			}
		}
		new In().function();
	}
	
	void method1(final int a){
		
		class Inn{
			void function()
			{
				System.out.println(a);//����no��
			}
		}
		new Inn().function();
	}
}

public class InnerClassDemo02 {
	public static void main(String[] args){
		new Out().method();
		new Out().method1(7);
		new Out().method1(8);
		
		Out out = new Out();
		out.method1(7);
		out.method1(8);
	}

}








































