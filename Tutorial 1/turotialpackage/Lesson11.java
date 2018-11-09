package turotialpackage;
import java.util.Scanner;
public class Lesson11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 
		Scanner Reversename = new Scanner(System.in);
		 System.out.print("Please enter your name. ");// Asks what your name is
		 String name = Reversename.nextLine( );//Creates string name = reveresedname

		 int strLen = name.length( );//defines the variable
		 String reversedName = "";// Stings the reverse name
		 for(int j = strLen - 1; j >= 0; j--)//loop
		 {
		 String letter = name.substring(j, j + 1); //picks up just one letter at a time
		 reversedName = reversedName + letter;
		 }
		 System.out.println(reversedName);// prints out the reversed name
		 }
		} 
	


