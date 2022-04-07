public class SecondLetters{
	private String userInput;
	private StringBuffer strBuff;
	private String second;

	public SecondLetters(){
		strBuff= new StringBuffer();
	}

	public void setUserInput(String userInput){
		this.userInput=userInput;
	}

	public void compSecondLetters(){
		for(int i=1; i< userInput.length();i=i+2){
			strBuff.append(userInput.charAt(i));
		}
		second=strBuff.toString();
	}

	public String getSecond(){
		return second;
	}
}