public class SpacePosition{
    //vars
    private String userInput;
    private int[] positions;

    //constructor
    public SpacePosition(){
        userInput=" ";
    }

    //set
    public void setUserInput(String userInput){
		this.userInput=userInput;
    }
    //compute
    public void findPositions(){
        positions=new int [userInput.length()];
        for(int i=0; i<userInput.length();i++){
            if(userInput.charAt(i)==' '){
                positions[i]=i;
            }
        }
    }
    //get
    public int[] getpositions(){
        return positions;
    }

}