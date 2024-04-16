package Eg_Chapter6;

public class MessageInterface {
	public static void main(String[] args) {
		TextMessage msg1 = new TextMessage("time2021: organizerVKU : createrHCPhap",
				"This ia an text created byHCPhap-VKU", "text");

		BinarryMessage msg2 = new BinarryMessage("time2021: organizedVKU : createrHCPhap", "101010101010101011110101",
				"binarry");
		msg1.printMessage();
		msg2.printMessage();

	}
}
