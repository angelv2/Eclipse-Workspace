package turotialpackage;

public class SuperHeroArrays {

	public static void main(String[] args) { 
		String[] superheroArray = {" Spiderman"," Batman", " Thor", " Captain America"," The Flash"}; // shows the superhero names
		boolean[] isHumanArray = {true, true, false, true, true }; // which superhero is human or not
		String[] superPowerArray = {"Webs and super human strength.","Gadgets.","Hammer and God of Thunder.","Shields and super human strength.","Speed and Time Travel."}; // Superhero Powers
		
		System.out.println(superheroArray[0]); // Prints the first element in the array
		System.out.println(superheroArray[superheroArray.length - 1]); // Prints the last element in the array
		
		System.out.println(); 
		for(int i = 0; i < superheroArray.length ; i++) { // Prints the array
			System.out.println("Name: " + i + superheroArray[i] + " \tPower: " + superPowerArray[i] +  " Are they human?: " + isHumanArray[i]); // Prints the name, power and if the superhero is human or not
			
		}
			System.out.println();
		for(int i = 0; i < isHumanArray.length ; i++) { // for loop if they are human or not
			System.out.println(superheroArray[i] + " Has been exposed to Kryptonite: " +  " Are they human?: " + isHumanArray[i] ); // Prints out that the superhero has been exposed to Kryptonite
			if(isHumanArray[i] == false) { // If Statement if the superhero will lose their power or not
				System.out.println("They have lost their power since they are non-human which turns into Power: NONE"); // Prints out that the superhero has lost their power since they are not human
				System.out.println(); // Used for Spacing
			}
			else { // else statement if the superhero is human or not
				System.out.println("They still have their power since they are still human. " + "\tPower: " + superPowerArray[i]); // Prints out that they still have their powers since they are human
				System.out.println(); 
			}
		
			
			
		}
			
	}}
		
			
	




