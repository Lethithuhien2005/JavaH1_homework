package homework6_Ex4;

public class FirstClass {
	private String msg;

	public FirstClass(String str) {

		this.msg = str;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static void main(String[] args) {
		FirstClass f = new FirstClass("Hello");
		String msg = f.getMsg();
		System.out.println(msg);
		msg = msg + " Java";
		f.setMsg(msg);
		System.out.println(f.getMsg());
	}
}
