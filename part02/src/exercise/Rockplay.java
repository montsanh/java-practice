package exercise;
import java.util.Scanner;

public class Rockplay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.print("철수 >> ");
		String user1 = scan.next();	// 철수 값 
		System.out.print("영희 >> ");
		String user2 = scan.next();	// 영희 값
		
		if (user1.equals("가위")) {
			if (user2.equals("가위")) System.out.println("비겼습니다.");
			
			else if (user2.equals("바위")) System.out.println("영희가 이겼습니다.");
			
			else System.out.println("철수가 이겼습니다.");
		}
		
		else if (user1.equals("바위")) {
			if (user2.equals("가위")) System.out.println("철수가 이겼습니다.");
			
			else if (user2.equals("바위")) System.out.println("비겼습니다.");
			
			else System.out.println("영희가 이겼습니다.");
		}
		
		else {
			if (user2.equals("가위")) System.out.println("영희가 이겼습니다.");
			
			else if (user2.equals("바위")) System.out.println("철수가 이겼습니다.");
			
			else System.out.println("비겼습니다.");
		}
		
		scan.close();

	}

}
