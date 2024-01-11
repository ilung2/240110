package Teacher;

import java.util.ArrayList;
import java.util.Iterator;

public class TestSearch {
	public static void main(String[] args) {
		Survey s1 = new Survey("김길동", "010-1234-5678", true);
		Survey s2 = new Survey("김둘리", "010-9876-5678", false);
		Survey s3 = new Survey("박둘리", "010-9876-5678", false);
		Survey s4 = new Survey("박박박", "010-9876-5678", false);
		Survey s5 = new Survey("이둘리", "010-9876-5678", true);
		Survey s6 = new Survey("이효리", "010-9876-5678", false);
		
		ArrayList<Survey> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		Iterator<Survey> iterator = list.iterator();
		while (iterator.hasNext()) {
			Survey next = iterator.next();
			String name = next.getName();
			if (name.startsWith("김")) {
				System.out.println(next);
			}
		}
	}
}








