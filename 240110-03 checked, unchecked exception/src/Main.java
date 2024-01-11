import java.io.IOException;

public class Main {
	public static void main(String[] args) {
//		throw new RuntimeException();
		try {
			throw new IOException(); // I = input, O = output
		} catch (IOException e) {
			System.out.println("체크드 예외는 예외처리가 필요합니다.");
		}
//		throw new Exception();
	}
}
