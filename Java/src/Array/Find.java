package Array;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,7,19,32};
		int index =halfSearch(arr,19);
		System.out.println(index);
	}
	
	
	//���幦�ܣ���ȡkey��һ�γ����������е�λ�ã��������±ꣻ��������-1��ʾ��key��������
	public static int getIndex(int[] arr, int key){
		for(int x=0 ;x<arr.length ; x++){
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
	
	//�۰���ң����Ч�ʣ��ұ���Ҫ��֤������Ϊ��������
	public static int halfSearch(int[] arr,int key){
		int min,max,mid;
		min = 0 ;
		max = arr.length-1;
		mid = (max + min)/2;
		
		while(arr[mid]!=key){
			if(key>arr[mid]){
				min= mid + 1;
				mid = (max + min)/2;
			}else if(key < arr[mid]){
				max= mid -1;
				mid = (max + min)/2;
			}else if(min>max){
				return -1;
			} 		
		}
		return mid;	
	}
}
















