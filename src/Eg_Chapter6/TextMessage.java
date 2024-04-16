package Eg_Chapter6;

public class TextMessage implements Message {
	private String header;
	private String body;
	private String type;

	public TextMessage(String header, String body, String type) {
		this.header = header;
		this.body = body;
		this.type = type;
	}

	@Override
	public String getHear() {
		return header;
	}

	@Override
	public void setHear(String str) {
		header = str;

	}

	@Override
	public String getBody() {
		return body;
	}

	@Override
	public void setBody(String str) {
		body = str;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String str) {
		type = str;

	}

	@Override
	public void printMessage() {
		System.out.println("Type: " + type + "\nheader: " + header + "\nbody: " + body);

	}

}
