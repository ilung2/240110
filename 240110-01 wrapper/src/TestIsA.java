import java.util.Arrays;

public class TestIsA {
	public static void main(String[] args) {
//		int [] arr = { 3.14, 10 };
//		
//		double[] d = { 3.14, 10 } ;
		
		Number[] arr = new Number[] { // 부모의 형을 숫자로 바꾸면 모두 본모습을 가질수있음.
				Integer.valueOf(10) // Integer형태로 10 그대로 가지고있음. 
				, Double.valueOf(3.14)
		};
		
		System.out.println(Arrays.toString(arr));
	}
}
