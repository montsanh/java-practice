public class LogicalOperator {
	public static void main(String[] args) {
		// 비교 연산
		System.out.println('a' > 'b');	//F
		System.out.println(3 >= 2 );	//T
		System.out.println(-1 < 0); 	//T
		System.out.println(3.45 <= 2); 	//F
		System.out.println(3 == 2); 	//F
		System.out.println(3 != 2); 	//T
		System.out.println(!(3 != 2) + "\n");  //F

		// 비교 연산과 논리 연산의 복합
		System.out.println( (3>2) && (3>4) ); 	//F
//		System.out.println( (3!=2) || (-1>0) ); //T
		System.out.println( (3!=2) ^ (-1>0)); 	// ?

	}

}
