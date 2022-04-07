public class Count {
	// count the letters
	// declare Var
	private String userInput;
	private StringBuffer strBuff;

	// constructor
	public Count() {
		strBuff = new StringBuffer();
	}

	// set
	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	// TODO: This method needs to return an integer, because you want to call it in
	// the
	// app method to find out the number of characters in the string that are
	// letters, so public int instead of public void
	// compute
	public int countString() {
		for (int i = 0; i < userInput.length(); i++) {
			// TODO: i've added a variable here just to make the rest a little more readable
			char myChar = userInput.charAt(i);

			if (Character.isLetter(myChar)) {
				strBuff.append(myChar);
			}
		}
		// TODO: return statement will send the number of characters in the buffer back
		// up to
		// the app
		return strBuff.length();
	}

}