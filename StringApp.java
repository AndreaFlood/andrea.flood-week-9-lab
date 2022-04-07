import java.util.Scanner;

import javax.swing.JOptionPane;

public class StringApp {
	public static void main(String[] args) {
		// declare vars
		String userInput;
		int countLetters;
		Scanner myInput = new Scanner(System.in);
		// create object
		Count co;
		co = new Count();

		// input
		// userInput = JOptionPane.showInputDialog(null, "Enter Message");
		System.out.println("enter message");

		userInput = myInput.nextLine();

		// set
		co.setUserInput(userInput);

		// compute
		countLetters = co.countString();

		// output
		System.out.println("count= " + countLetters);

	}
}