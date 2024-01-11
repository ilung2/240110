package Teacher;

import java.util.ArrayList;

// 설문조사 집계 프로그램
// 인적사항 (이름, 전화번호)와
// 응답(찬성, 반대)
// 정보를 기록하는 프로그램

// 정보 기록, 응답 집계 (총 찬성, 반대 수 출력)

// 단, 동일 인물의 기록한 하나만 존재해야한다.
class Survey {
	private String name;
	private String phoneNumber;
	private boolean agree;
	
	public Survey(String name, String phoneNumber, boolean agree) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.agree = agree;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isAgree() {
		return agree;
	}
	public void setAgree(boolean agree) {
		this.agree = agree;
	}
	@Override
	public String toString() {
		return "Survey [name=" + name + ", phoneNumber=" + phoneNumber + ", agree=" + agree + "]";
	}
}

public class Poll {
	public static void main(String[] args) {
		Survey s1 = new Survey("길동", "010-1234-5678", true);
		Survey s2 = new Survey("둘리", "010-9876-5678", false);
		
//		System.out.println(s1);
//		System.out.println(s2);
		
		ArrayList<Survey> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		
//		System.out.println(list.size() == 2);
		
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			Survey survey = list.get(i);
			if (survey.isAgree()) {
				count++;
			}
		}
		System.out.println("찬성 수 : " + count);
		System.out.println("반대 수 : " + (list.size() - count));
	}
}












