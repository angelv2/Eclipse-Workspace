package turotialpackage;

public class Data4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Bob","Angel","Bradley","Brix","Gio","Stefano","Jim","Josh","Paul","Mark"};
		double[] amtRaised = {50,103,205,143,234,324,123,167,124,321 };
		boolean[] hasForm = {true,false,false,false,true,true,true,false,false,true};
		for(int i = 0; i< names.length; i++) {
			System.out.println(names[i]+""+amtRaised[i]+""+hasForm[i]);
		}
		double totalRaised = 0;
		for(int i = 0; i< amtRaised.length; i++) {
		totalRaised=amtRaised[i];
		}
	   System.out.println("Total Raised"+ totalRaised );
	   System.out.println("Avg Raised"+ totalRaised/names.length);
	   
	   int over200Cnt = 0;
	   for(int i = 0; i< names.length; i++) {
		   if(amtRaised[i]>200) {
			   over200Cnt++;
		   }
	   }
	   System.out.println("The Number of People raised over 200:" + over200Cnt);
	   int noFormsCnt = 0;
	   for(int i = 0; i< names.length; i++) {
		   if (hasForm[i]==false) {
			   noFormsCnt++;
		   }
	   }
	   System.out.println("Number of People with no forms:" + noFormsCnt);
	   
	   int lowestIndex = 0;
	   for(int i = 0; i< amtRaised.length; i++) {
		   if(amtRaised[lowestIndex]>amtRaised[i]) {
				lowestIndex = i;
	   }
		   System.out.println("Lowest amt raised: "+amtRaised[lowestIndex]);
		   
		   double over200clubTotal = 0;
		   for(int i1 = 0; i1<amtRaised.length;i1++) {
		   	if(amtRaised[i1] > 200) {
		   		over200clubTotal += amtRaised[i1];
		   		System.out.println(names[i1]);
	
	}
}
		   System.out.println(over200clubTotal);
		}
	} }
	   
		   
		   
		   
		   
		   
		   