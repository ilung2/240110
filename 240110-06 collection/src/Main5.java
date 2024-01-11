import java.util.ArrayList;

public class Main5 {
	public static void main(String[] args) {
//		ArrayList<Object> forAll = new ArrayList<>();
//		forAll.add(100);
//		forAll.add(55.55);
//		forAll.add("문자열");
//		
//		Object o = forAll.get(0);
//		System.out.println(forAll.get(0));
		
		ArrayList<Double> list = new ArrayList<Double>();

		list.add(1.0);
		
//		list.add("zzz");
		
		list.add((double) 55);
		list.add(Integer.valueOf(55).doubleValue());
	}
}
