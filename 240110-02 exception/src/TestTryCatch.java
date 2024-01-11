import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTryCatch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		// 원래는 위에서 아래로 흐를때 초기화가 되지만 try 블럭 안에서 초기화 한다면 catch에서 아닐수도 있다 생각해서 에러가뜸 따라서 try문 밖에서 초기화해야함.
		try { 
			a = scan.nextInt();
			b = scan.nextInt();
			
			System.out.println(a / b);
	
		} catch (ArithmeticException e) { // 예외 클래스는 상속구조 Runtime은 모든 예외들에 부모 이고 Exception이 Runtime에 부모
			System.out.println("예외 발생 확인");
			System.out.println("0으로 나눌 수 없습니다.");
//			System.out.println(a);
//			System.out.println(b);
		} catch (InputMismatchException e) {
			System.out.println("상수를 입력해야합니다.");
		} catch (RuntimeException e) { // 부모형의 클래스를 위에서 잡아버리면 컴파일 에러가 나지만 아래로 하면 나지않음.
			System.out.println("Arimetic 예외와 InputMismatch 에외를 제외한 모든 Runtime 예외 처리");
		}
//		System.out.println(a);
//		System.out.println(b);
	}
}
