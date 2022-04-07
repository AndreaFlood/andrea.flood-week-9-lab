import javax.swing.JOptionPane;

public class StringApp {
	public static void main(String[] args) {
		// declare vars
		String userInput;
		int countLetters;
		int countVowels;
		String secondLetters;
		int[] positions;
		String replaceVowels;

		// create objects
		Count co;
		co = new Count();
		Vowels vo;
		vo = new Vowels();
		SecondLetters sl;
		sl =new SecondLetters();
		SpacePosition sp;
		sp =new SpacePosition();
		ReplaceVowels rv;
		rv = new ReplaceVowels();

		// input
		userInput = JOptionPane.showInputDialog(null, "Enter Message");

		// set
		co.setUserInput(userInput);
		vo.setUserInput(userInput);
		sl.setUserInput(userInput);
		sp.setUserInput(userInput);
		rv.setUserInput(userInput);

		// compute
		countLetters = co.countString();
		countVowels = vo.countVowels();
		secondLetters= sl.compSecondLetters();
		positions= sp.compPositions();
		replaceVowels= rpReplaceVowels();



		// output
		JOptionPane.showMessageDialog(null, userInput + "\nThis String Has:\n" +countLetters + " Letters & " + countVowels + " Vowels", "Character & Vowel Counter", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Every Second letter is " + secondLetters);
		JOptionPane.showMessageDialog(null, "Your Spaces are in positions " + positions);
		JOptionPane.showMessageDialog(null, "Your Spaces with ! in replament of Vowels is " + replaceVowels);
}
}