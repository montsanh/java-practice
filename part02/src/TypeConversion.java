public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i =100;
		
		System.out.println(b+i); 	// 227
		System.out.println(10/4);	// 2
		System.out.println(10.0/4);	// 2.5
		System.out.println((char)0x12340041); //'A' 0x가 16진수, char로 변환되서 1234 데이터손실, 0x0041 -> A
		
		
	}
}
