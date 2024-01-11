import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<>();
		strs.add("첫번째");
		strs.add("두번째");
		strs.add("세번째");
		
//		for (int i = 0; i < strs.size(); i++) {
//			System.out.println(strs.get(i));
//		}
//		for (String elem : strs) {
//			System.out.println(elem);
//		}
		Iterator<String> iter = strs.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
