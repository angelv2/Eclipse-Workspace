package turotialpackage;

public class Product {
			
		private String name; // name of the product
		private double price; // price of the product
		
		
		
		/**
		 * A constructor for Product to set default values
		 */
		public Product() { //sets the default value of the product method
			name = " ";
			price = 0;
		}
		
		
		
		/**
		 * It's a constructor to provide the variables with values using the parameter values
		 * @param name - this is the name of product
		 * @param price - this is the price of product
		 */
		public Product(String name, double price) { // sets the value of each variable using the parameters
			this.name = name;
			this.price = price;
			
		}
		
		
		
		/**
		 * this prints out the price of the product
		 * @return - this is the value of price
		 */
		public double getPrice() { // returns the value of the variable price
			return price;
			
		}
		
		
		
		/**
		 * this will print out the products information
		 */
		public String toString() { // returns the value of every variable
			return ("Product: " + name + " Price: " + price);
		}
		
	}


