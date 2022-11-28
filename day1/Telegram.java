package week1.day1;

public class Telegram {
	public void sendsms() {
		System.out.println("Happy to learn java");
		
	}
	public void makecall() {
		System.out.println("calling my friend");
	}
	public static void main(String[] args) {
		Telegram action=new Telegram();
		action.sendsms();
		action.makecall();
	}
}
