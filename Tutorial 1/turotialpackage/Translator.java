package turotialpackage;
import java.util.Scanner;
public class Translator {



	public static Scanner scan = new Scanner(System.in);
	public static String choice = "";
	
	public static void TranslatorOpt1() {
		System.out.println("Would you like to:\n1. English to Tagalog(Filipino)\n2. Tagalog(Filipino) to English");	//Ask user if they want English to filipino or filipino to english
		int userchoice = scan.nextInt();	//Stores the user's choice
		 if(userchoice == 1) {	//Runs if the user picks the first option
			 EngtoTagalog();// English to Tagalog  
		 }
		 
		 
		 else if(userchoice == 2) {	//Runs if the user picks the second option
			 EngtoTagalog(); //Runs Tagalog to English
		 }//end else if choice 2
		
	}
	

	public static void EngtoTagalog() {
		String[] English = {"Phone","House", "School", "Watch", "Clock", "Book", "Car", "Keyboard", "Dog", "Airplane", "Bag", "Mirror", "Glass", "Ball", "Money"};//Words in English
		String[] Tagalog = {"Telepono","Bahay","Paaralan","Panoorin","Orasan","Libro","Kotse","Teklado","Aso","Eruplano","Supot","Salamin","Baso","Bola","Pera"};//Words in Tagalog/Filipino
		System.out.println("These are all the words that can be translated:"); //Prints out the words that can be translated
		
		
		for(int i = 0; i < English.length; i++) {	//Lists all English word translatable to Tagalog
			System.out.println(i + ". " + English[i]);
		}
				System.out.println();
		
		
		
		System.out.println("What word would you like to be translated?");//Asks the user what word they would want to translate
		scan.nextLine();	
		choice = scan.next();//input
		
		
		for(int i = 0; i < English.length; i++) {	//Checks every word in the String and once located it prints out the word	
			boolean locatedornot = false;	//If the word is located or not
			do {	
				if(choice.equalsIgnoreCase(English[i])) {	
					locatedornot = true;
					if(locatedornot == true) {	//Set to true so the user can continue
						System.out.println("English: " + English[i] + "\nTagalog: " + Tagalog[i]);
					}
				}
				
			i++;	
			}while(i != English.length);	
			
			if(locatedornot == false) {	//set to false
				System.out.println("Word not found. Return to translater option");//Prints out if the word isn't found	
				TranslatorOpt1();	//goes back to the options
			}
		}
		
		System.out.println();
		
		System.out.println("Would you like to translate another word? \n1. Yes\n2. No");	//Ask user if they would like to translate another word
		int numchoice = scan.nextInt();	//Stores the user's choice
		if(numchoice == 1) {	//If the user choses the first option it continues
			System.out.println("Returning to the Translator Option..."); //Prints out that it is returning to the options
			TranslatorOpt1();//goes back to the options
		}
		
		else {	//else statement if user picks second option
			System.out.println("Goodbye!");//prints out Goodbye
			System.exit(-1);//Exits the program
		}
	}
	
	public static void main(String[] args) {
		TranslatorOpt1();	//Calls TranslatorOpt and runs the whole code
		
	}


	public static void TagalogtoEng() {
		String[] English = {"Phone","House", "School", "Watch", "Clock", "Book", "Car", "Keyboard", "Dog", "Airplane", "Bag", "Mirror", "Glass", "Ball", "Money"};//Words in English
		String[] Tagalog = {"Telepono","Bahay","Paaralan","Panoorin","Orasan","Libro","Kotse","Teklado","Aso","Eruplano","Supot","Salamin","Baso","Bola","Pera"};//Words in Tagalog/Filipino
	
	
	System.out.println("These are all the words that are available for translation:");// Prints out the words that are available
	for(int i = 0; i < Tagalog.length; i++) {	//Lists all the tagalog words
		System.out.println(i + ". " + Tagalog[i]);
	}
	
	
	System.out.println("What word would you like to translate?"); //Asks the user what word they would want to translate
	scan.nextLine();		
	choice = scan.next();	//input
	
	
	for(int i = 0; i < Tagalog.length; i++) {//Checks every word in the String and once located it prints out the word
		boolean locatedorNot = false;	//If the word is located or not
		do {	
			if(choice.equalsIgnoreCase(Tagalog[i])) {	
				locatedorNot = true;
				if(locatedorNot == true) {	//Set to true so the user can continue
					System.out.println("Tagalog: " + Tagalog[i] + "\nEnglish: " + English[i]);
				}
			}
		
		
		i++;	
		}while(i != Tagalog.length);	
		
		if(locatedorNot == false) {	//set to false
			System.out.println("Word not found. Return to translater option");//Prints out if the word isn't found	
			TranslatorOpt1();	//Brings the user back to the options
		}
	}
	
	System.out.println();
	
	
	
	System.out.println("Would you like to translate another word? \n1. Yes\n2. No");	//Ask user if they would like to translate another word
	int numchoice = scan.nextInt();	//Stores the user's choice
	if(numchoice == 1) {	//If the user choses the first option it continues
		System.out.println("Returning to the Translator Option..."); //Prints out that it is returning to the options
		TranslatorOpt1();
	} 
	
	
	
	else {	//else statement if user picks second option
		System.out.println("Goodbye!");//prints out Goodbye
		System.exit(-1);//Exits the program
	}
}

	public static void main1(String[] args) {
		TranslatorOpt1();
	
}	
	
}
			
			




