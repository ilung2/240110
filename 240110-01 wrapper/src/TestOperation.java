public class TestOperation {
	public static void main(String[] args) {
		int a = 10;
		
		Integer b = Integer.valueOf(10);
		
//		System.out.println(a == b);
//		System.out.println(50 < b); 
		
		Integer c = Integer.valueOf(100);
		
//		System.out.println(b < c);
		
		Long l = Long.valueOf(10);
		
//		System.out.println(b == l); // 다른타입이라 관계연산자가 사용불가능.
		System.out.println(b.equals(l)); // 값은 같지만 타입이 달라서 false  
	}
}
