package Array;

public class BubbleSort {
	/*相邻的两个元素进行比较
	 * 如果符合条件就换位
	 * 升序排序
	 */
	/**也是嵌套循环
	 * 第一次排序后小的往前跑，大的往后面跑；最大值跑到最后面了
	 * 第二次排序还是从零脚标开始排序；第二大的值也有自己的位置啦
	 * 
	 * 希尔排序是最快的排序，三层循环加上位运算，效率也是最高的
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static void String(int[] arr){
		for(int x=0; x<arr.length-1 ; x++){//说明循环的次数
			for(int y=0; y<arr.length-x-1  ; y++){
				if(arr[y]>arr[y+1]){
					
					int temp = arr[y] ;
					arr[y]=arr[y+1];
					arr[y+1] = temp;					
				}
			}
		}
	}
}
