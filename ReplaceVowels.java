public class ReplaceVowels{
	private String userInput;
	private StringBuffer strBuff;
	private String replace;

	public ReplaceVowels(){
		strBuff=new StringBuffer();
	}

	public void setUserInput(String userInput){
		this.userInput=userInput;
	}

	public void ReplaceStringVowels(){
		for(int i=0; i< userInput.length();i++){
			//Replace all the vowels with exclamation marks
			Character character = userInput.toLowerCase().charAt(i);
			if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u'){
				strBuff.append('!');
			}
			else{
			strBuff.append(character);
			}
		}
		replace=strBuff.toString();
	}

	public String getReplace(){
		return replace;
	}
}