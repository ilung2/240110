import java.util.Scanner;

// 두 정수를 콘솔에 입력받아
// 첫번째 수를 두번째 수로 나눈 몫 출력하기
public class DivideProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수");
		int first = scan.nextInt();
		
		System.out.println("두번째 정수");
		int second = scan.nextInt();
		
		
		if (second != 0) {
			System.out.println("나눈 몫 : " + (first / second));
		} else {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		
//		try {
//		System.out.println("나눈 몫 : " + (first / second));
//		} catch (ArithmeticException e) {
//			System.out.println("0으로는 나눌 수 없습니다.");
//		}
	}
}
