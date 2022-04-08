import javax.swing.JOptionPane;

public class StringApp {
	public static void main(String[] args) {
		// declare vars
		String userInput;
		int countLetters;
		int countVowels;
		String secondLetters;
		String positions;
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
		rv.ReplaceStringVowels();
		co.countString();
		vo.countVowels();
		sl.compSecondLetters();
		sp.compPositions();

		// Get
		countLetters = co.getCountString();
		countVowels = vo.getCountVowels();
		secondLetters= sl.getSecond();
		positions= sp.getpositions();
		replaceVowels = rv.getReplace();



		// output
		System.out.println(userInput);
		JOptionPane.showMessageDialog(null, userInput + "\nThis String Has:\n" +countLetters + " Letters & " + countVowels + " Vowels", "Character & Vowel Counter", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Every Second letter is " + secondLetters);
		JOptionPane.showMessageDialog(null, "Your Spaces are in positions " + positions);
		JOptionPane.showMessageDialog(null, "Your Spaces with ! in replacement of Vowels is " + replaceVowels);
}
}