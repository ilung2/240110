import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// Collection
		
		// index를 활용하여 순차적 접근가능
		// 동적인 size 필요할때 원하는 만큼 추가 가능
		// <> 제네릭(generic)
		ArrayList<String> list = new ArrayList<String>();
		list.add("원소1"); // 삽입 (insert)
//		list.add("asd"); 순서대로 출력
		list.add("원소2");
		list.add("원소3");
		
		System.out.println("크기: " + list.size());
//		System.out.println(list.toString());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}
}
