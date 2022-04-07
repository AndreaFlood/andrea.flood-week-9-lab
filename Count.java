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

	// compute
	public int countString() {
		for (int i = 0; i < userInput.length(); i++) {
			char myChar = userInput.charAt(i);

			if (Character.isLetter(myChar)) {
				strBuff.append(myChar);
			}
		}
		
		//return
		return strBuff.length();
	}
}