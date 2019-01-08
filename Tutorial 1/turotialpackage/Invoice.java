package turotialpackage;
import java.util.ArrayList;
public class Invoice {
		
		
	
	public static void main(String[] args) {}
		// TODO Auto-generated method stub
		
		private Customer theCustomer; // creating a variable using the customeer method
		public ArrayList<LineItem> Item = new ArrayList<>(); // holds the items that are being bought and how many there are
		
		
		
		/**
		 * A constructor for customer Invoice
		 * @param theCustomer - the customer for which the invoice is meant for
		 */
		public Invoice(Customer theCustomer) { //fills theCustomer variable with parameter values
			this.theCustomer = theCustomer;
		}
		
		
		
		/**
		 * It adds a desired product to the customer's order
		 * @param theProduct 
		 * @param qty of the product
		 */
		public void addToOrder(Product product, int qty ) { //adds items to the ArrayList
			Item.add(new LineItem(qty,product));
			
		}
		
		
		
		/**
		 * It prints out the total price of the customer's order and if they can buy it with their money
		 */
		public void  printInvoice() {
			System.out.println("Products:");//prints out the products
			for(int i = 0; i < Item.size(); i++) { // prints out each product in the arraylist and the quantity being bought and its individual price, also with the total price
				System.out.printf(Item.get(i) + "Total $%.2f" , (Item.get(i).getProduct().getPrice()* Item.get(i).getQty()));
				System.out.println();
				
			}
			
			if(amountDue() <= theCustomer.getFunds()) { // if the customer has enough money
				System.out.println("Your order has been approved!");//prints out that your order has been approved
				
			}
			else {
				double moneyShortage = theCustomer.getFunds() - amountDue(); // calculates the money
				moneyShortage = moneyShortage * -1; // converts the negative to positive
				System.out.printf("You don't have enough money for that item. You are short by $%.2f", moneyShortage); // prints out that you dont have enough money and prints out how much money you need
				System.out.println();
			}
		}
		
		
		
		/**
		 * This checks if the customer can afford they ordered
		 * @param theCustomer - it's the customer and their order
		 * @return - will be true if the customer can afford the order, false otherwise
		 */
		public boolean canAfford(Customer theCustomer) { // if the customer can buy all the items
			if(amountDue() <= theCustomer.getFunds()) { // if the customer still has money
				return true;
				
			}
			else { //if the customer has no more money
				return false;
			
			}
		}
		
		
		
		/**
		 * 
		 * @return theCustomer
		 */
		
		public Customer TheCustomer() {
			return theCustomer;
		}
		
		
		
		/**
		 * This calculates the total price of the customer's order
		 * @return - the total value of all items in the customer's order
		 */
		public double amountDue() { //returns the total price of all the items in the ArrayList
			double totalPrice = 0;
			for(int i = 0; i < Item.size(); i++) { //A loop that multiplies the product's price by the quantity that is being bought and then added to the total price
				totalPrice = totalPrice + Item.get(i).getProduct().getPrice()* Item.get(i).getQty();
			}
			
			return totalPrice; // Returns the total amount due for this order
			
		}
		

	}


