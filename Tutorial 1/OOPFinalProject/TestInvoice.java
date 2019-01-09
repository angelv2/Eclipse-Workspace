package OOPFinalProject;

import turotialpackage.Customer;
import turotialpackage.Invoice;
import turotialpackage.Product;

public class TestInvoice {
	
	
	/**
	 * this will run the invoice method
	 * @param c - this is the customer
	 * @param i - this is the customer's invoice
	 */
	public static void runInvoice(Customer c, Invoice i) { // This will print out the customer's invoice
		i.printInvoice(); // This runs the printInvoice (it is from the Invoice method) 

		if(c.getFunds()- i.amountDue() < 0) { // If customer's funds is less than the total price of their order this continue
			System.out.println("Evil villian credit union to the rescue!!");	
			c.addFunds(i.amountDue() - c.getFunds()); // This adds the money difference to the customer's funds, so that they can have their order approved 
			System.out.println("New funds total: " + c.getFunds()); // This will print out the new amount of funds that they have
		}
		
		i.printInvoice(); // This runs the printInvoice again so it could show that the customer can now buy whatever they ordered
	}//end runInvoice

	public static void main(String[] args) {
		// Invoice run 1
		
		Customer c = new Customer("island", "Dr evil", 1630.0); // This will create a new customer using the provided info
		Invoice in = new Invoice(c); // This creates a new invoice for the customer
		in.addToOrder(new Product("Blasters",223.50), 2); // This adds the product to the customer's order
		in.addToOrder(new Product("Dinos", 203.9),3);
		in.addToOrder(new Product("Guns",140.20),15);
		
		runInvoice(c,in); //runs invoice
		
		//invoice run 2
		Customer c1 = new Customer("Batcave", "Batman", 10000.0);
		Invoice in1 = new Invoice(c1);
		in1.addToOrder(new Product("Batman's suit",300), 1);
		in1.addToOrder(new Product("Batman's cape", 50.35), 1);
		in1.addToOrder(new Product("Batman's Gadget set", 100.99), 1);
		
		
		runInvoice(c1,in1); //runs invoice
		
		//invoice run 3
		Customer c2 = new Customer("Avengers Headquarters", "Ironman", 1000000000.00);
		Invoice in2 = new Invoice(c2);
		in2.addToOrder(new Product("Ironman's suit", 550.30), 2);
		in2.addToOrder(new Product("Ironman's AI", 400.20), 1);
		in2.addToOrder(new Product("Ironman blasters", 900.00), 2);
		
		
		runInvoice(c2,in2); //runs invoice
		
		//invoice run 4
		Customer c3 = new Customer("New York, Queens", "Spider-Man", 120.50);
		Invoice in3 = new Invoice(c3);
		in3.addToOrder(new Product("Spider-Man's suit ",200.30), 1);
		in3.addToOrder(new Product("Spider-Man's web ", 43.30), 20);
		in3.addToOrder(new Product("Iron Spider-Man suit ", 550.60), 1);
		
		
		runInvoice(c3,in3); //runs invoice
		
	}
	
}




