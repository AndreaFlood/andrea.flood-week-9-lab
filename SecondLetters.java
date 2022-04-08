public class SecondLetters{
	private String userInput;
	private StringBuffer strBuff;
	private String second;

	public SecondLetters(){
		strBuff= new StringBuffer();
	}

	public void setUserInput(String userInput){
		this.userInput=userInput.toLowerCase();
	}

	public void compSecondLetters(){
		String lower = userInput.toLowerCase().replaceAll("\\s", "");
		for(int i=0; i< lower.length(); i++){
			if (i % 2 == 0){
				// pass
			}else{
				if (Character.isLetter(lower.charAt(i)) == true) {
					strBuff.append(lower.charAt(i));
				};
			}
		}

		second=strBuff.toString();
		System.out.println(second);
	}

	public String getSecond(){
		return second;
	}
}