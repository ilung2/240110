public class Main {
	public static void main(String[] args) {
		Integer i = Integer.valueOf(10);
		
		// Auto-Boxing
		Integer box = 100;
		
		int primitive = i.intValue();
		
		int unbox = box;
		
		Object o = 100;
		
		System.out.println(o);
	}
}
