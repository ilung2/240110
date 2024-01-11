import java.util.ArrayList;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
public class Main6 {
	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<>();
		
		Person gildong = new Person("길동", 22);
		
		personList.add(null);
		personList.add(gildong);
		if (!personList.contains(new Person("길동",22))) {
			personList.add(gildong);
		}
		personList.add(new Person("둘리", 33));
		
		System.out.println(personList);
	}
}
