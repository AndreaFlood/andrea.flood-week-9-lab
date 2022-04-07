public class Vowels{

    //declare Var
	private String userInput;
    private StringBuffer strBuff;
    private String countVowels;

	//constructor
	public Vowels(){
		strBuff=new StringBuffer();

	}

	//set
	public void setUserInput(String userInput){
		this.userInput=userInput;
		}

	//compute
	public void countVowels(){
		for(int i=0; i<userInput.length(); i++){
			if(Character.isLetter(userInput.charAt(i))){
				countVowels=countVowels+1;
			}
		}
	}

	//get
	public String getCountLetters(){
		return countLetters;
	}

}
