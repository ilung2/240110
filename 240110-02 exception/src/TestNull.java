public class TestNull {
	public static void main(String[] args) {
		String str = null;
		
		if (str != null) {
			System.out.println(str.toString());
		} else {
			System.out.println("Null 참조입니다.");
		}
		
//		try {
//			System.out.println(str.toString());
//		} catch (NullPointerException e) {
//			System.out.println("Null 참조입니다.");
//		}
	}
}
