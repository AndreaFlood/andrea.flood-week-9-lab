public class SpacePosition{
    //vars
    private String userInput;
    private int[] positions;
    private int counter = 0;

    //constructor
    public SpacePosition(){
        userInput=" ";
    }

    //set
    public void setUserInput(String userInput){
		this.userInput=userInput;
    }
    //compute
    public void compPositions(){
        for (int i=0; i < this.userInput.length(); i++){
            if (this.userInput.charAt(i) == ' '){
                this.counter = counter + 1;
            }
        }
        positions = new int[counter];
        counter = 0;
        for (int i=0; i < this.userInput.length(); i++){
            if (this.userInput.charAt(i) == ' '){
                positions[counter] = i;
                counter = counter + 1;
            }
        }
    }
    //get
    public String getpositions(){
        String output = "";
        for (int i=0; i< this.positions.length; i++){
            output = output + Integer.toString(this.positions[i]) + " ";
        }
        return output;
    }

}