package OOPFinalProject;
import turotialpackage.Product;
public class LineItem {
	
	private int qty; // The amount of products being bought
	private Product theProduct; // The product that is being bought 
	
	
	
	/**
	 * this is a constructor for LineItem, that provides it with default values
	 */
	public LineItem() { // This will set default values for the LineItem method
		qty = 0;
	}
	
	
	
	/**
	 * This a constructor for LineItem, that fills the variables with parameter values
	 * @param qty - The quantity of the product being bought
	 * @param theProduct - The product that is being bought being bought
	 */
	public LineItem(int qty, Product theProduct) { // this will set values of the variables, that are using the values of the given parameters
		this.qty = qty;
		this.theProduct = theProduct;
	}
	
	
	
	/**
	 * This will print out the amount of the products being bought
	 * @return - the value of qty
	 */
	public int getQty() { // This will return the qty of the product or products being bought
		return qty;
	}
	
	
	
	/**
	 * This will print out the product being bought
	 * @return - the product being bought
	 */
	public Product getProduct() { // This will return the product and its information
		return theProduct;
	}
	
	
	
	
	/**
	 * This will prints out products information + how much of the product is being bought
	 */
	public String toString() { // This will return the values of all variables in the LineItem method
		return ("Quantity: " + qty + " " + theProduct); 
	}

}
