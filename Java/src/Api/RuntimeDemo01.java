package Api;
/*Runtime����
 * ����û���ṩ���캯��
 * ˵��������new������ôֱ���뵽�����з������Ǿ�̬��
 * ���Ǹ����л��зǾ�̬������
 * ˵��������һ�����ṩ������ȡ������󣻶��Ҹ÷����Ǿ�̬�ģ����ҷ���ֵ�Ǳ������ͣ�
 * 
 * 
 * �÷�ʽ��static Runtime getRuntime();
 */
public class RuntimeDemo01 {
	public static void main(String[] args) throws Exception{
		Runtime r = Runtime.getRuntime();
		r.exec("notepad.exe  RuntimeDemo01.java");
		
		//Process p = r.exec("");
		//p.destroy();//ɱ���˽���
	}
}
