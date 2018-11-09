package turotialpackage;
import java.util.Scanner;
public class Store {

	//Tesla Roadster = $257 000
	//Honda Civic Type R = $33 900
	//Bugatti Chiron = $3 000 000
	//Thanos car = $200 000 000 

	public static class carStore {
		public static void startUp() {
			@SuppressWarnings("resource")
			Scanner Store = new Scanner( System.in );
			System.out.println("Hello what's your name?");// asks what your name is
			String name = Store.nextLine();//strings the next code
			System.out.println("Hello, "+ name+ ", welcome to the Veloso's Vehicles.");//Prints out welcome to the Veloso's Vehicles
		}

		public static void calculations()	{
			
		}
		
		public static void carStoreMain()	{
		int teslaQuantity = 0;//Creates variable tesla quantity
		int chironQuantity = 0;//Creates variable chiron quantity
		int typeRQuantity = 0;//Creates variable creates type R quantity
		int thanosQuantity = 0;//Creates variable thanos car quantity
		double totalCost = 0;// total cost of purchase
		int loop = 0;//creates a loop
		final double TAX = 0.05;//5% tax
		double teslaCost = 257000;//cost of the tesla
		double chironCost = 3000000;//cost of the chiron
		double typeRCost = 33900;//cost of the type R
		double thanosCost = 200000000; //cost of the thanos car
		startUp();// start up
		@SuppressWarnings("resource")
		Scanner scNum = new Scanner( System.in );
		while(loop == 0) {
			System.out.println("What vehicle would you like to purchase?\n1. 2052 Tesla Roadster\n2. 2018 Bugatti Chiron\n3. 2018 Honda Civic Type R\n4. Thanos Car");//asks the user which one he wants to buy
			int choice = scNum.nextInt();
			if (choice == 1)	{//if statement
				System.out.println("How many would you like?");//asks how many cars you want
				int quantity = scNum.nextInt();
				double carCost = quantity*teslaCost;//adds up how much the tesla is depending on the quantity
				double carTax = carCost*TAX;//adds the tax
				totalCost = carCost+carTax; // total cost of verything
				teslaQuantity = teslaQuantity+quantity;
				System.out.println("Are you looking for any other cars?\n1. Yes\n2. No");//ask if you want any other cars
				int choiceExit = scNum.nextInt();// exit
				if (choiceExit == 1)	{
				}
				else if (choiceExit == 2)	{
					break;
				}
				else	{
					System.out.println("Not a valid option");//prints out not a valid option
				}
				
			}
			else if (choice == 2)	{
				System.out.println("How many cars would you like?");//asks how many cars you want
				int quantity = scNum.nextInt();
				double carCost = quantity*chironCost;//adds up how much the chiron is depending on the quantity
				double carTax = carCost*TAX;//adds the tax
				totalCost = carCost+carTax;// total cost of verything
				chironQuantity = chironQuantity+quantity;
				System.out.println("Would you like to buy something else?\n1. Yes\n2. No");//ask if you want any other cars
				int choiceExit = scNum.nextInt();// exit
				if (choiceExit == 1)	{
				}
				else if (choiceExit == 2)	{
					break;
				}
				else	{
					System.out.println("Not a valid option");//prints out not a valid option
				}
			}
			else if (choice == 3)	{
				System.out.println("How many cars would you like?");//asks how many cars you want
				int quantity = scNum.nextInt();
				double carCost = quantity*typeRCost;//adds up how much the type R is depending on the quantity
				double carTax = carCost*TAX;//adds the tax
				totalCost = carCost+carTax;// total cost of verything
				typeRQuantity = typeRQuantity+quantity;
				System.out.println("Would you like to buy something else?\n1. Yes\n2. No");//ask if you want any other cars
				int choiceExit = scNum.nextInt();// exit
				if (choiceExit == 1)	{
				}
				else if (choiceExit == 2)	{
					break;
				}
				else	{
					System.out.println("Not a valid option");//prints out not a valid option
				}
			}
			else if (choice == 4)	{
				System.out.println("How many would you like?");//asks how many cars you want
				int quantity = scNum.nextInt();
				double carCost = quantity*thanosCost; //adds up how much the thanos car is depending on the quantity
				double carTax = carCost*TAX;//adds the tax
				totalCost = carCost+carTax;// total cost of verything
				thanosQuantity = thanosQuantity+quantity;
				System.out.println("Would you like to buy something else?\n1. Yes\n2. No");//ask if you want any other cars
				int choiceExit = scNum.nextInt();// exit
				if (choiceExit == 1)	{
				}
				else if (choiceExit == 2)	{
					break;
				}
				else	{
					System.out.println("Not a valid option");//prints out not a valid option
				}
			}
			else	{
				System.out.println("Sorry that is not a valid option.");//prints out not a valid option
			}
		}
		System.out.printf("\nYou have\nTesla : " + teslaQuantity + "\nChiron : " + chironQuantity + "\nType R : " + typeRQuantity + "\nThanos Car : " + thanosQuantity + "\nThe total cost is : $%.2f" , totalCost);//prints out what you bought and total cost tax included
	}

		public static void main(String[] args) {
			carStoreMain();
		}

	}}
	

