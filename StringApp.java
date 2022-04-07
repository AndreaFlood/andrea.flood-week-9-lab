import javax.swing.JOptionPane;
public class StringApp{
	public static void main( String[] args){
//declare vars
    String userInput;
   	String countLetters;

//create object
	Count co;
	co=new Count();

//input
	userInput=JOptionPane.showInputDialog(null,"Enter Message");

//set
    co.setUserInput(userInput);

//compute
	co.countString();

//get
	countLetters=co.getCountLetters();

//output
	System.out.printLn("count= " + countLetters);

	}
}