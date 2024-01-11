public class TestStaticMethods {
	public static void main(String[] args) {
		int parse = Integer.parseInt("456"); // => 문자열 456을 int값으로 바꿔줌
		System.out.println(parse + 100);
		
		Integer value = Integer.valueOf("987");
		System.out.println(value);
		
		int result = value.compareTo(Integer.valueOf(100)); // value를 100이랑 비교해서 크면 1 작으면 -1
		System.out.println(result);
		
		boolean same = value.equals(Integer.valueOf(986)); // value를 986이랑 동등한지 같으면 true 다르면 false
		System.out.println(same);
//		int ext = Integer.parseInt("zzz"); // 문자열zzz는 숫자서식이 아니라서 int값으로 바꿀수없음. 숫자 서식이어야만 가능.
		
		System.out.println("프로그램 정상 종료");
	}
}
