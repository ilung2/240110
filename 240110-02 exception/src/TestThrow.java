class UnImplementException extends RuntimeException {
	public UnImplementException(String message) {
		super(message);
	}
}

interface YourWork {
	String doSomething();
}

class Impl implements YourWork {
	@Override
	public String doSomething() {
		throw new UnImplementException("아직 덜 만들었는디요.");
	}
}

public class TestThrow {
	public static void main(String[] args) {
		YourWork ref = new Impl();
		String result = ref.doSomething();
		
		if (result.length() != 0) {
			System.out.println(result);
		}
	}
}