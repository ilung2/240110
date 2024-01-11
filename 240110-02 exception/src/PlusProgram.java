import java.util.InputMismatchException;
import java.util.Scanner;

// 두 정수를 콘솔에 입력받아
// 합을 출력하는 프로그램
public class PlusProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("첫번째 정수를 입력하세요.");
			int first = scan.nextInt();

			System.out.println("두번째 정수를 입력하세요.");
			int second = scan.nextInt();
			
			System.out.println("합: " + (first + second));
		} catch (InputMismatchException e) {
//			System.out.println("예외 메세지 확인: " + e.getMessage());
//			e.printStackTrace();
			System.out.println("예외 발생 확인");
		}
		System.out.println("프로그램 정상 종료");
	}
}
