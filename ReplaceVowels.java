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

	public void ReplaceVowels(){
		for(int i=0; i< userInput.length();i++){
			//Replace all the vowels with exclamation marks
			if(userInput.charAt(i)=='a' || userInput.charAt(i)=='e' || userInput.charAt(i)=='i' || userInput.charAt(i)=='o' || userInput.charAt(i)=='u'){
				strBuff.append('!');
			}
			else{
			strBuff.append(userInput.charAt(i));
			}
		}
		replace=strBuff.toString();
	}

	public String getReplace(){
		return replace;
	}
}