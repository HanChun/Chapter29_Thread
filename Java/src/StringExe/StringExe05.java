package StringExe;

public class StringExe05 {

	public static void main(String[] args) {
		// Êý×é×ª×Ö·û´®
		int[] arr = {34,12,89,68};
		String str = toString(arr);
		String str2 = toString_2(arr);
	}

	private static String toString_2(int[] arr) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		
		sb.append("[");
		for(int i=0; i<arr.length ; i++){
			if(i!=arr.length-1){
				sb.append(arr[i]+",");
			}else{
				sb.append(arr[i]+"]");
			}
		}
		return sb.toString();
	}

	private static String toString(int[] arr) {
		// TODO Auto-generated method stub
		String str = "[";
		for(int i=0 ; i<arr.length; i++){
			if(i!=arr.length-1){
				str+=arr[i]+",";
			}else{
				str+=arr[i]+"]";
			}		
		}
		return str;
		
	}

}
