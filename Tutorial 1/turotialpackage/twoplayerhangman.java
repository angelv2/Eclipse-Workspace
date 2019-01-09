package turotialpackage;
import java.util.Scanner;
public class twoplayerhangman {
	
	private static String[] words = {"phone", "car", "math", "chair", "bottle", "dog" }; // array of words that are picked for the program for the user to guess
	private static String word = words[(int) (Math.random() * words.length)];// Randomizes the words to guess
	private static String letters = new String(new char[word.length()]).replace("\0", "*");//replaces "*" with the correct letter
	private static int count = 0;// how many tries are left

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		while (count < 6 && letters.contains("*")) { //how many tries you have to guess the word
			
			System.out.println("Guess any letter in the word");//asks the user to guess a letter for the randomized word
			System.out.println(letters);//prints out the letters that were guessed
			String guess = input.next();//guess the next letter 
			hang(guess);
		}
		input.close();
	}

	public static void hang(String guess) {//Strings the guessed letters
		String newletters = "";//Strings the guessed letters
		
		for (int i = 0; i < word.length(); i++) {//prints out the randomized words
			if (word.charAt(i) == guess.charAt(0)) {
				newletters += guess.charAt(0);
			
			} else if (letters.charAt(i) != '*') {
				newletters += word.charAt(i);
		
			} else {//else statement
				newletters += "*";//if user doesnt guess the right letter
			}
		}

		if (letters.equals(newletters)) {//if user guesses the right letters
			count++;
			hangmanImage();//hangman image
		
		} else {//else statement
			letters = newletters;//prints out the right letters
		}
		
		if (letters.equals(word)) {// if statement if the user guesses the word
			System.out.println("WOW! Good job, you guessed it! It was " + word);//prints out if you guesed the word right + "word"
		}
	}
	public static void hang1(String guess) {//Strings the guessed letters
		for (int i = 0; i < word.length(); i++) {//prints out the randomized words
			if (word.charAt(i) == guess.charAt(0)) {
			
			} else if (letters.charAt(i) != '*') {
		
			} else {//else statement
				
			}}
		}

	public static void hangmanImage() {
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



