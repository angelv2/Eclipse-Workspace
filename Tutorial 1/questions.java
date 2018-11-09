
public class questions {

	public static boolean isSingleDigit(int x)	{
		//This is the main variable to return
		boolean determine;
		//This checks if the number is less than 10 or more than -10, its impossible
		//for it to be a double because the function only accepts integers
		if (x > -10 && x < 10)	{
			//Changes determine to true
			determine = true;
		}
		//If not a single digit number initializes determine to false
		else	{
			determine = false;
		}
		//returns the boolean
		return determine;
	}
	//Prints everything
	public static void main(String[] args)	{
			System.out.println(isSingleDigit(100));
			System.out.println(isSingleDigit(47));
			System.out.println(isSingleDigit(2));
	}


		

	}




	




	
