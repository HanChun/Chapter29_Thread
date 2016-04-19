package Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*������֮�����ӳ���ϵ����map���ϴ�
 * 
 * ��ӡĳ���ַ�������ĸ���ֵĴ���
 * 
 */
public class DemoExe {
	public static void main(String[] args){
		String str = "fdg+avAdc bs5dDa jfksditwu";
		String s = charCount(str);
	}
	
	public static String charCount(String str){
		char[] chs = str.toCharArray();//string�������
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		for(int i = 0; i<chs.length ; i++){
			if(!(chs[i]>='a' && chs[i]<='z' || chs[i]>='A' && chs[i]<='z'))	
				continue;
			
			Integer value = tm.get(chs[i]);			
			if(value==null)
				tm.put(chs[i],1);
			else
				tm.put(chs[i],value+1);
		}		
		return mapToString(tm);
	}
	
	public static String mapToString(Map<Character,Integer> map){
		StringBuilder sb = new StringBuilder();
		
		Iterator<Character> it = map.keySet().iterator();
		while(it.hasNext()){
			Character key = it.next();
			Integer value =map.get(key);
			
			sb.append(key + "("+value+")");
		}	
		return sb.toString();		
	}
}

























