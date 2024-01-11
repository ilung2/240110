import java.util.ArrayList;
import java.util.Scanner;

// 사용자에게 0이하의 정수를 입력할 때까지
// 정수를 여러번 입력받아
// 입력된 순서대로 모든 정수를 출력하기
public class Main4 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("정수 입력?");
			int num = scan.nextInt();
			if (num > 0) {
				numbers.add(num);
			} else {
				break;
			}
		}
		
		System.out.println(numbers);
	}
}
