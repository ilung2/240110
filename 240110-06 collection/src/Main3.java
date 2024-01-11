import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
		// 정수 원소 1, 2, 3을 가지는 ArrayList 생성하기
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(Integer.valueOf(3));
		
		int firstElem = list.get(0); // unboxing
		System.out.println(firstElem);
		
		System.out.println(list.size());
		
		list.clear(); // clear 원소가 다 사라짐.
		
		System.out.println(list.size());
	}
}
