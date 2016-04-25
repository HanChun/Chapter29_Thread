package StringExe;

public class StringExe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append(true);
		sb.append("haha").append(false);//·µ»ØÖµÎªStringBuffer sb£¬
		sb.insert(2, "it");
		sb.delete(2, 3);
		String s = sb.toString();
		System.out.println(sb);
	}

}
