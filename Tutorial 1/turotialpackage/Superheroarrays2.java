package turotialpackage;

public class Superheroarrays2 {

	

	public static class Superhero {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	// sets up arrays
	String[] SuperHeroArray= {"Brix Boy","Angel","Vision","Thor","Loki"};
	String[] SuperPowerArray= {"Bulletproof","Flight","Laser beam","God of thunder","God of mischief"};
	boolean[] isHumanArray = {true, true, false, false, false};
	System.out.println(SuperHeroArray[0]);
	System.out.println(SuperHeroArray[SuperHeroArray.length - 1]); // Prints out the last element in the array

	for(int i = 0; i < SuperHeroArray.length ; i++) { // Prints array
		System.out.println("Name: " + SuperHeroArray[i] + " \n\tPower: " + SuperPowerArray[i] +  " \nAre they human?: " + isHumanArray[i]); 
	}

	for(int i = 0; i < isHumanArray.length ; i++) { // It's a for loop for if they are human or not
		System.out.println(SuperHeroArray[i] + " Has been exposed to cryptonite: " +  " \nAre they human?: " + isHumanArray[i] ); // It print all the heros have been exposed to cryptonite
		if(isHumanArray[i] == false) {
			System.out.println("They have lost their power since they are non-human which turns into Power: NONE"); // It prints They have lost their power since they are non-human which turns into Power: NONE
			System.out.println(); 
		}
		else { 
			System.out.println("They still have their power since they are human. " + "\n\tPower: " + SuperPowerArray[i]); 
	}	
	}
	}
	}




}
