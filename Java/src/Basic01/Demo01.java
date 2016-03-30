package Basic01;
//main是被虚拟机所识别的一个名称
//字符：字母数字符号，且''里面只能放一个    '4' 'a'
//字符串常量：“ab”
//null常量
/**
 * 十进制：0-9
 * 八进制：0-7；用0开头 --023
 * 十六进制：0-9，A(10)B(11)C(12)D(13)E(14)F(15);
 *		       满16进1，以0x开头表示
 *
 *字节（最小单位）：8位0,1的组合表示一个字节(so 一个字节最大值是255
 *其实ip地址也是按照那个计数的  255.255.255.0  没有大于255的)
 *
 *在内存中，一个数字其实是4个字节表示
 *
 *编码表（ASCII码表）：用字节表示实际的生活中应用的符号
 *后来衍生成，三位代表一位，三位代表一位----八进制
 *后来又有四位代表一位---十六进制
 *之所以出现这些，其实是为了更方便的表示数据
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(6));
		System.out.println(Integer.toBinaryString(-6));
		
		byte b = 2;  //-128~127
		//byte b1 = 128; (错啊，精度损失啊)
		long l = 4l;
		
		float f = 2.3f;
		double d = 2.3 ;
		
		char ch = '4';
		char ch1 = 'a';
		char ch2 =' ';
		
		
		byte c=3;
		//c= c+2;
		//报错原因，c为byte +上 int 结果变为int，
		//但仍然用byte型的c去接必然错误
		c=(byte)(c+2);

		System.out.println('a'+1);
		//'a'占两个8位，1为int型是4个字节，所以系统自动上升，打印出来的为int 98
		System.out.println((char)('a'+1) );
		
		System.out.println( ('A'+0) );
		
		int x = 4270;
		x= x/1000 * 1000;
		System.out.println(x);//4000
		
		System.out.println(1%-5);//1
		System.out.println(-1%5);//-1
		
		int a = 3,e;
		e = a++; //e=3 a=4
		/*		\n: 换行
		 * 		\b: 退格 相当于backspace
		 * 		\r：按下回车 
		 * 		\t: 制表符；相当于tab
		 */
		System.out.println("\"hello\"");  //打印带双引号的hello
		System.out.println("\\hello\\");  //打印带有\\的字符串
		
		char chh = '\n';
		
		short s = 4;
		s+=5;
		
		/*  ^:异或；
		 *  true ^ true = false;
		 *  true ^ false = true;
		 *  false ^ true = true;
		 *  false ^ false = false;
		 *  两边相同结果为false
		 *  两边不同结果为true
		 */
		
		/*  && 短路（第一次判断满足，就得出结论）
		 *  // 短路
		 *  单&，无论左边真假，右边都运算
		 *  双&&，左边假了，右边不用运算  也为假
		 *  
		 *  单| ：两边都参与运算
		 *  双||：当左边为true时，右边不运算
		 */
		
		/*
		 * 位运算  << 往左移两位
		 * 3<<2=12 -----3*4
		 * 6>>2=1  
		 * 6>>1=3
		 * <<往左移，移多少位就是乘2的多少次幂(变大)
		 * >>往右移动，.........除2..........最高位的符号与原来数据的相同(变小)
		 * 
		 * >>>如果最高位为1，右移后，用0补空位
		 */
		
		
		/*  &也可以进行位运算
		 * 6 & 3 = 2
		 * （110 和 011的对应位的  1,0 判断   结果为：010=2） 
		 */
		
		/* | 进行位运算
		 * 6   |   5 = 7
		 * 110 | 101 = 111
		 */
		
		/* ^
		 *   6 ^  5  = 3
		 * 110 ^ 101 = 011
		 */
		
		/*反码 ~
		 * -6的表现形式    6的二进制取反加1
		 * 反码（正数的反码）求其十进制代表的整数：反码先减一，
		 * 再取反，求其整数，再加上负号
		 */
		System.out.println(~6);//-7
		
		/*7^4^4 = 7
		 * 一个数异或同一个数两次，结果还是那个数
		 * 可以用异或加密
		 */
		
		/*
		 * 位运算更加高效   e.g.乘法运算
		 * 2*8 ----->   2<<3
		 */
		
		/*不借助第三方
		 * 让m,n互换值
		 */
		int n=3,m=8;
		n = n+m ;
		m = n-m ;
		n = n-m ;
		  
		n = n ^ m;
		m = n ^ m ;//(n^m^m)=n
		n = n ^ m; //
		
		
		
		
	}
}























