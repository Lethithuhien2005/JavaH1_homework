package Eg_chapter5;

public class BookExercise {
	public static void main(String[] args) {
		Person author = new Person("HCPhap", 45, "VKU");
		Book OOP_Practice = new Book("OOP practice with Java", author, 200, 50);
		OOP_Practice.details();
	}
}