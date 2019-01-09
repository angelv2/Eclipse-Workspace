package OOPFinalProject;

public class Customer {
	
	
	private String secretLairLocation; // customers secret lair location
	private String name; // name of the customer
	private double evilFunds; // how much money the customer has
	
	
	
	/**
	 * A constructor for the customer
	 */
	public Customer() { // sets a blank value for the method
		name = " "; 
		secretLairLocation = " ";
		evilFunds = 0;
		
	}
	
	
	
	/**
	 * The constructor for customer
	 * @param secretLairLocation - It's the lair location for the customer
	 * @param name - the name of the customer
	 * @param evilFunds -the amount of money that the customer has
	 */
	public Customer(String secretLairLocation, String name, double evilFunds) { // fills the variable with values
		this.secretLairLocation = secretLairLocation;
		this.name = name;
		this.evilFunds = evilFunds;
		
	}
	
	
	
	
	
	/**
	 * this will add funds to evilFunds
	 * @param amount - the amount that is being added to evilFunds
	 */
	public void addFunds(double amount) { // This adds money to evilFunds, by using the value given in the parameters
		this.evilFunds = this.evilFunds + amount;
		
	}
	
	public double getFunds() { // returns the value of evilFunds
		return evilFunds;
		
	}
	
	
	
	/**
	 * prints out the customer's information
	 */
	public String toString() { // This returns the values of all the variables in the Customer method
		return ("Location: " + secretLairLocation + " Name: " + name + " Money: " + evilFunds); 
		
	}


}




