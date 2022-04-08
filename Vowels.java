public class Vowels{
    // declare Var
	private String userInput;
	private int countVowels;

	// constructor
	public Vowels() {
		countVowels = 0;
	}
	// set
	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	// compute
	public void countVowels() {
		for (int i = 0; i < this.userInput.length(); i++) {

			// Convert individual characters to lower case for comparison
			char character = userInput.toLowerCase().charAt(i);
			if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'){
				// If character is vowel, increase counter by 1
				this.countVowels ++;
			}
		}
	}
	public int getCountVowels(){
		//return the counter value
		return this.countVowels;
	}
}