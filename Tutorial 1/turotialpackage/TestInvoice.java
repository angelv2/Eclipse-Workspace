package turotialpackage;

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
			
			Customer c = new Customer("island", "Dr evil", 1230.0); // This will create a new customer using the provided info
			Invoice in = new Invoice(c); // This creates a new invoice for the customer
			in.addToOrder(new Product("flame Thower",123.80), 3); // This adds the product to the customer's order
			in.addToOrder(new Product("sharks", 105.2),2);
			in.addToOrder(new Product("lasers",50.5),20);
			
			runInvoice(c,in); //runs invoice
			
			//invoice run 2
			Customer c1 = new Customer("fortress of solitude", "Superman", 5000.0);
			Invoice in1 = new Invoice(c1);
			in1.addToOrder(new Product("Supermans's suit",100), 1);
			in1.addToOrder(new Product("Superman's hair", 50), 3);
			in1.addToOrder(new Product("Superman action figure", 40.25), 2);
			in1.addToOrder(new Product("Superman phone cases", 15.58), 1);
			in1.addToOrder(new Product("Superman tshirts", 32.78), 2);
			
			runInvoice(c1,in1); //runs invoice
			
			//invoice run 3
			Customer c2 = new Customer("Avengers hq", "Captain America", 20000000.00);
			Invoice in2 = new Invoice(c2);
			in2.addToOrder(new Product("Captain America's shield", 50.00), 2);
			in2.addToOrder(new Product("Captain Americas's suit", 150.25), 1);
			in2.addToOrder(new Product("Captain America's helmet", 25.62), 2);
			in2.addToOrder(new Product("Captain America action figure", 32.25), 4);
			in2.addToOrder(new Product("Captain America motorcylce", 10000.00), 2);
			
			
			runInvoice(c2,in2); //runs invoice
			
			//invoice run 4
			Customer c3 = new Customer("New York", "Spider-Man", 120.50);
			Invoice in3 = new Invoice(c3);
			in3.addToOrder(new Product("Spider-Man's suit ",62.40), 1);
			in3.addToOrder(new Product("Spider-Man's web toy", 35.30), 1);
			in3.addToOrder(new Product("Spider-Man action figure", 23.10), 2);
			in3.addToOrder(new Product("Spider-Man game disc", 80.00), 1);
			in3.addToOrder(new Product("Spider-Man socks", 21.21), 2);
			
			runInvoice(c3,in3); //runs invoice
			
		}
		
	}


