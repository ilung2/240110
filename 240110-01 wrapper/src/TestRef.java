public class TestRef {
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf(10);
		
		System.out.println(i1 == i2); // 참조 비교
		System.out.println(i1.equals(i2)); // 
		
		Integer i3 = new Integer(10); 
		
		System.out.println(i1 == i3);
		System.out.println(i1.equals(i3));
		
		i1 = i1 + 50; // 60이 나오지만 새 참조가 일어남 i1 = 60으로 새 참조가 일어남
	}
}