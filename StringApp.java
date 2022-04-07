import javax.swing.JOptionPane;

public class StringApp {
	public static void main(String[] args) {
		// declare vars
		String userInput;

		// TODO: This needs to be an int, not a String, because you are going to store
		// the
		// return value from the IC method in here
		int countLetters;

		// create object
		Count co;
		co = new Count();

		// input
		userInput = JOptionPane.showInputDialog(null, "Enter Message");

		// set
		co.setUserInput(userInput);

		// compute
		countLetters = co.countString();

		// output
		System.out.println("count= " + countLetters);

	}
}