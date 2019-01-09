package turotialpackage;
import java.util.Scanner;
public class Hangmanplayer2 {
		
		public static String word1() {//Strings the word that player 1 enters for player 2
			@SuppressWarnings("resource")
			Scanner input1 = new Scanner(System.in);
			System.out.println("Enter a word for player 2 to guess:");// asks player 1 to enter a random word for player 2 to guess
			String guessword = input1.nextLine();
			return guessword;
		}
		static String words = word1();
		public static String letters = new String(new char[words.length()]).replace("\0", "*");//replaces "*" with the correct letter
		public static int count = 0;// how many tries are left
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);// scanner

			while (count < 6 && letters.contains("*")) {// the amount of guesse player has 
				System.out.println("Guess any letter in the word:");//asks the user to guess a letter for the randomized word
				System.out.println(letters);//prints out the letters that were guessed
				String guess = input.next();;//guess the next letter 
				hang(guess);
			}
			input.close();
		}

		public static void hang(String guess) {
			String newletters = "";//Strings the guessed letters
			for (int i = 0; i < words.length(); i++) {//prints out the word
				if (words.charAt(i) == guess.charAt(0)) {
					newletters += guess.charAt(0);
					
				} else if (letters.charAt(i) != '*') {
					newletters += words.charAt(i);
					
				} else {//else statement
					newletters += "*";//if user doesnt guess the right letter
				}
			}

			if (letters.equals(newletters)) {//if user guesses the right letters
				count++;
				hangmanimage();//hangman image
				
			} else {//else statement
				letters = newletters;//prints out the right letters
			}
			if (letters.equals(words)) {// if statement if the user guesses all the correct letters
				System.out.println("You guessed it good job! The word was " + words);//tells you won and tells you the word
			}
		}
		
		public static void hangmanimage() {
			if (count == 1) {// first wrong guess
				System.out.println("Wrong guess, try again");//prints out the hangman image if you guessed a wrong letter
				System.out.println();//prints out the hangman image if you guessed a wrong letter
				System.out.println();//prints out the hangman image if you guessed a wrong letter
				System.out.println();//prints out the hangman image if you guessed a wrong letter
				System.out.println();//prints out the hangman image if you guessed a wrong letter
				System.out.println("___|___");//prints out the hangman image if you guessed a wrong letter
				System.out.println();//prints out the hangman image if you guessed a wrong letter
			}
			else if (count == 2) {// second wrong guess
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
			else if (count == 3) {// third wrong guess
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
			else if (count == 4) {// fourth wrong guess
				System.out.println("Wrong guess, try again you can do it!");//prints out the hangman image if you guessed a wrong letter
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
			else if (count == 5) {// fifth wrong guess
				System.out.println("You are joking right? try again");//prints out the hangman image if you guessed a wrong letter
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
		
			else if (count == 6) {// sixth wrong guess
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
				System.out.println("GAME OVER! The word was " + words);//prints out game over and the word
			}
			 
		}

	}

