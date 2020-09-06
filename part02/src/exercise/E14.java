package exercise;
import java.util.Scanner;

public class E14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요 ");
		System.out.print("철수 >> ");
		String in = scan.next();
		
//		if(in.equals("가위"))
//			System.out.println("1");
//		else if(in.equals("바위"))
//			System.out.println("2");
//		else if(in.equals("보"))
//			System.out.println("3");
//		else
//			System.out.println("0");
		
		
		
		switch(in) {
			case "가위" :
				System.out.println("1"); break;
			case "바위" :
				System.out.println("2"); break;
			case "보" :
				System.out.println("3"); break;
			default :
				System.out.println("0");
				
		scan.close();
		}
	}
}
