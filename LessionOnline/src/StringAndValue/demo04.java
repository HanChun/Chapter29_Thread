package StringAndValue;
/**
 * @author HANXT
 * 黑洞数：任何一个完全不同的四位数，经过一个算法 
 * （四位数排列的最大值）-（四位数排列的最小值）= 
 *   多次如此后，陷入一个固定的数值
 * 6174
 */
public class demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5346; 
		
		for(;;){
			char[] cc = (n + "").toCharArray();
			java.util.Arrays.sort(cc); //对数组进行排序,由小到大
			
			int min = 0 ;
			for(int i=0 ; i<cc.length ; i++ ) min  =  min*10 + ( cc[i] - '0' );
			//System.out.println(min);
			
			int max = 0 ;
			for(int i=cc.length-1 ; i>=0 ; i--) max = max*10 + ( cc[i] - '0');
			//System.out.println(max);
			
			int n2 = max - min;
			if(n==n2) break;
		}		
	}
}












