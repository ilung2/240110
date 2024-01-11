import javax.net.ssl.ExtendedSSLSession;

class MyClass {
	public void step1() {
		step2();
	}

	private void step2() {
		step3();
//		try {
//			step3();
//		} catch (Exception e) {
//			
//		}
	}

	private void step3() {
		throw new RuntimeException();
//		try {
//			throw new RuntimeException();
//		} catch (Exception e) {
//			
//		}
	}
}

public class Main {
	public static void main(String[] args) {
		MyClass my = new MyClass();
		my.step1();

		System.out.println("프로그램 정상 종료");
	}
}
