package homework1_2;

public class Person {
	String name;
	int age;
	String address;

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}

	public void Details() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("address: " + address);
	}
}

class Teacher extends Person {
	String institution_name;
	String courses;

	public Teacher(String name, int age, String address, String ins, String crs) {
		super(name, age, address);
		institution_name = ins;
		courses = crs;
	}

	public String getInstitution_name() {
		return institution_name;
	}

	public void setInstitution_name(String institution_name) {
		this.institution_name = institution_name;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public void Details() {
		super.Details();
		System.out.println("Institution name: " + this.getInstitution_name());
		System.out.println("Courses: " + this.getCourses());
	}
}