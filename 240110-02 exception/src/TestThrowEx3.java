import java.util.NoSuchElementException;

public class TestThrowEx3 {
	public static int indexOf(String[] arr, String target) {
		if (arr == null) {
			throw new NullPointerException("참조 배열이 null입니다. 확인 필요");
		}
		
		if (arr.length == 0) {
			throw new IllegalArgumentException("배열의 길이가 0입니다.");
		}
		
		if (target == null) {
			throw new IllegalArgumentException("찾고자 하는 대상이 null입니다. 확인 필요");
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(target)) {
				return i;
			}
		}
		throw new NoSuchElementException("찾고자 하는 원소가 없습니다.");
	}
	
	public static void main(String[] args) {
		System.out.println(indexOf(new String[] { "a", "b", "c"}, "d"));
		
		System.out.println(indexOf(null, "a"));
		
		System.out.println(indexOf(new String[] {}, "a"));
		
		System.out.println(indexOf(new String[] { "a", "b", "c" }, null));
	}
}
