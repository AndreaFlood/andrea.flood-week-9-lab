public class Count{
//count the letters
    //declare Var
	private String userInput;
    private StringBuffer strBuff;
    private String countLetters;

	//constructor
	public Count(){
		strBuff=new StringBuffer();
	}

	//set
	public void setUserInput(String userInput){
		this.userInput=userInput;
		}

	//compute
	public void countLetters(){
		for(int i=0; i<userInput.length(); i++){
			if(Character.isLetter(userInput.charAt(i))){
				strBuff.append(userInput.charAt(i));
			}
		}
	}

	//get
	public String getCountLetters(){
		return countLetters;
	}

}