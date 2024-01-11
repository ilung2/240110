class MyArrIndexException extends RuntimeException {
	private int length;
	private int index;
	
	public MyArrIndexException(String message, int length, int index) {
		super(message);
		this.length = length;
		this.index = index;
	}

	public int getLength() {
		return length;
	}

	public int getIndex() {
		return index;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + "\n"
				+ "참조 하는 배열의 길이는 " + length
				+ "이지만 " + index + "에 접근하고있습니다.";
	}
}
public class TestThrowEx2 {
	public static String elemOf(String[] arr, int index) {
		if (index >= 0 && index < arr.length) {
			return arr[index];
		}
		throw new MyArrIndexException("해당 배열 인덱스 범위를 벗어났습니다."
				, arr.length
				, index);
	}
	
	public static void main(String[] args) {
		String[] strArr = {
				"문자열1",
				null,
				"문자열2",
				"문자열3"
		};
		
		String value = elemOf(strArr, 5);
		System.out.println(value);
	}
}
