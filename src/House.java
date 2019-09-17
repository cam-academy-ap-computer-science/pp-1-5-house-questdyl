
public class House {

	public static void main(String[] args) {
		// Print letters
		jobs();
		System.out.println("\n");
		mom();
		System.out.println("\n");
		mark();
	}
	public static void intro() {
		// First pragraph for every letter
		System.out.println("\tI am writing you this letter in a Java program,");
		System.out.println("even though it's extremely inefficient to do so.");
		System.out.println("(My teachers are making me do this)");
		System.out.println("So please forgive me for any tipos I make.");
		System.out.println("\nAnyways,");
	}
	public static void done() {
		// Closing remark
		System.out.println("\nSincerely, Dylan");
	}
	public static void jobs() {
		// Letter to Steve Jobs
		System.out.println("Dear Steve Jobs,");
		intro();
		System.out.println("I just wanted to write you to let you know that Android is infinitelty better.");
		done();
	}
	public static void mom() {
		// Letter to my mom
		System.out.println("Dear mom,");
		intro();
		System.out.println("I was just writing you to say thanks for being willing to");
		System.out.println("Drive me to school at such an ungodly hour in the morning.");
		System.out.println("I know how difficult it is to wake up and drive at such a");
		System.out.println("time as 6:40 in the morning.");
		done();
	}
	public static void mark() {
		// Letter to one of the CS teachers *hint* *hint*
		System.out.println("Dear Mark,");
		intro();
		System.out.println("I've bypassed the mainframe and gained access to your Facebook account.");
		System.out.println("If you don't send me $100,000,000 in bitcoin at");
		System.out.println("1asdfmzFVj8ALj6mfBsbifRoD4miY36v, I will leak all");
		System.out.println("your private information to your employer and");
		System.out.println("make you get fired from your job.");
		done();
		System.out.println("P.S.");
		System.out.println("I want to make it clear that I'm just joking around lol.");
	}
}
