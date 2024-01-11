import java.util.ArrayList;
import java.util.Scanner;

// 설문조사 집계 프로그램
// 인적사항 (이름, 전화번호)와
// 응답(찬성, 반대)
// 정보를 기록하는 프로그램

// 정보기록, 응답 집계 (총 찬성, 반대 수 출력)

// 단, 동일 인물의 기록은 한개만 존재
class PersonInformation {
	private String name;
	private String phoneNum;

	public PersonInformation(String name, String phoneNum) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "PersonInformation [name=" + name + ", phoneNum=" + phoneNum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNum == null) ? 0 : phoneNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PersonInformation))
			return false;
		PersonInformation other = (PersonInformation) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNum == null) {
			if (other.phoneNum != null)
				return false;
		} else if (!phoneNum.equals(other.phoneNum))
			return false;
		return true;
	}

}

class Answer {
	private String name;
	private String phoneNum;
	private String answer;

	public Answer(String name, String phoneNum, String answer) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [name=" + name + ", phoneNum=" + phoneNum + ", answer=" + answer + "]";
	}

}

public class Poll {
	public static void main(String[] args) {
		ArrayList<PersonInformation> personList = new ArrayList<>();
		ArrayList<Answer> answerList = new ArrayList<>();
		int yesCount = 0;
		int noCount = 0;
		while (true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴를 고르세요");
		System.out.println("1.설문조사 2. 나가기");
		int input = scan.nextInt();
		scan.nextLine();
			switch (input) {
			case 1:
					System.out.println("설문조사를 합니다");
					
					System.out.println("이름을 입력하세요.");
					String name = scan.nextLine();
					
					System.out.println("전화번호를 입력하세요.");
					String phoneNum = scan.nextLine();

					PersonInformation personInfo = new PersonInformation(name, phoneNum);
//			System.out.println(personList.size());

					if (!personList.contains(personInfo)) {
						System.out.println("설문 응답을 적어주세요. 찬성 or 반대 ");
						personList.add(personInfo); // 없는 정보를 리스트에 저장.
						String answer = scan.nextLine();

						answerList.add(new Answer(name, phoneNum, answer)); // 응답 리스트에 추가.
						if (answer.equals("찬성")) {
							yesCount++;
							System.out.println("찬성 수: " + yesCount);
							System.out.println("반대 수: " + noCount);
						} else {
							noCount++;
							System.out.println("찬성 수: " + yesCount);
							System.out.println("반대 수: " + noCount);
						}

					} else {
						System.out.println("이미 응답한 사람입니다.");
					}
					break;
			case 2:
				System.out.println("찬성 수: " + yesCount);
				System.out.println("반대 수: " + noCount);
				System.out.println("총 투표수 : " + (yesCount + noCount));
				System.out.println("프로그램 종료");
				System.exit(2);
			default:
				System.out.println("잘못된 입력이니 다시 입력해주세요.");
				break;
			}
		}
	}
}