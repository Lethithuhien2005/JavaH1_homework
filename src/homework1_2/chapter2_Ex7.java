package homework1_2;

public class chapter2_Ex7 {
	public static void main(String[] args) {
		Person person1 = new Person("Nguyen Van A", 28, "Da Nang");
		Teacher teacher1 = new Teacher("Le Thi C", 26, "Quang Tri", "VKU university", "K23");
		person1.Details();
		System.out.println("-------------");
		teacher1.Details();
	}
}
