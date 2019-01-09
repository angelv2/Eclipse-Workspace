package turotialpackage;
import java.util.Scanner;
public class hangmanV2 {
	

	public static void main(String[] args) { 
		Scanner input= new Scanner(System.in);

		String player1,player2;
		int wrongguessamount = 0; //keeps the count of the amount of wrong guesses
		int correctguessamount = 0; //keeps count of the amount of correct guesses
		int maxincorrect=6;//makes sure the user cant guess more than 6 times
		int count = 0;
		String letters = null;
		String word = null;
		String a,b,c,d,e,f,g,h,i,j,k,l,m,n,p,q,r,s,t,u,v,w,x,y,z;
		System.out.println("please enter a phrase player 1");
		player1=input.nextLine();//player 1 enters the secret word
	
		

		player1=player1.toLowerCase();//secret word get lower cased


		for (int ii=0;ii < player1.length();ii++)
		{
		System.out.print("*");//the secret word is hidden with stars
		}
		char[] lettersreveal = new char[player1.length()]; 
		for (int aa = 0; aa<lettersreveal.length; aa++) { 
		lettersreveal[aa] = '*'; 
		}

		System.out.println("player2 guess a character"); 

		while ( wrongguessamount< maxincorrect&& correctguessamount<player1.length() )//player 2 starts guessing letters

		{ 
		String guess1=input.nextLine(); 

		int match = player1.indexOf(guess1);//it takes the guessed letter and tries to find it in the secret word
		if( match == -1){//if the guess is wrong it tells the user to guess again
			if (count == 1) {
				System.out.println("Wrong guess, try again");//prints out the hangman image if you guessed a wrong letter
				System.out.println();//prints out the hangman image if you guessed a wrong letter
				System.out.println();//prints out the hangman image if you guessed a wrong letter
				System.out.println();//prints out the hangman image if you guessed a wrong letter
				System.out.println();//prints out the hangman image if you guessed a wrong letter
				System.out.println("___|___");//prints out the hangman image if you guessed a wrong letter
				System.out.println();//prints out the hangman image if you guessed a wrong letter
			}
			else if (count == 2) {
				System.out.println("Wrong guess, try again you can do it!");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("___|___");//prints out the hangman image if you guessed a wrong letter
			}
			else if (count == 3) {
				System.out.println("So close!, try again");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   ____________");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   | ");//prints out the hangman image if you guessed a wrong letter
				System.out.println("___|___");//prints out the hangman image if you guessed a wrong letter
			}
			else if (count == 4) {
				System.out.println("You are joking right? try again");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   ____________");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |          _|_");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |         /   \\");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |        |     |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |         \\_ _/");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("___|___");//prints out the hangman image if you guessed a wrong letter
			}
			else if (count == 5) {
				System.out.println("Wrong guess, try again you can do it!");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   ____________");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |          _|_");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |         /   \\");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |        |     |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |         \\_ _/");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |           |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |           |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("___|___");//prints out the hangman image if you guessed a wrong letter
			}

			else if (count == 6) {
				System.out.println("GAME OVER! Nice try.");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   ____________");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |          _|_");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |         /   \\");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |        |     |");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |         \\_ _/");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |          _|_");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |         / | \\");//prints out the hangman image if you guessed a wrong letter
				System.out.println("   |          / \\ ");//prints out the hangman image if you guessed a wrong letter
				System.out.println("___|___      /   \\");//prints out the hangman image if you guessed a wrong letter
				System.out.println("GAME OVER! The word was " + word);// //prints out game over and the word
			}
			 
		}
		}
		wrongguessamount++;{
	}

		if (letters.equals(letters)) {//if user guesses the right letters
			count++;

		
		} else {//else statement
			letters = letters;//prints out the right letters
		}
		
		if (letters.equals(word)) {// if statement if the user guesses the word
			System.out.println("WOW! Good job, you guessed it! It was " + word);{//prints out if you guesed the word right + "word"
		}
	}
	}}






	





		


