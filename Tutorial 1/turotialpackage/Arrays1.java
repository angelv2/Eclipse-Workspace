package turotialpackage;
import java.util.Random;
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create 2 arrays
				String[] studentsArray = {"thanos","Peter Parker","shrek","Barney","Bradley"};
				int[] gradesArray = new int[studentsArray.length];
				int avg = 0;
				//print arrays
				
				for(int i = 0; i <= studentsArray.length; i++) {
					System.out.println("name: " + studentsArray[i] + " grades: " + gradesArray[i]);
				}
				//random grades entry
				@SuppressWarnings("unused")
				Random r = new Random();
				for(int i = 0; i < studentsArray.length; i++) {
					System.out.println("name: " + studentsArray[i] + " grades: " + gradesArray[i]);
				}
				//update index 5
				gradesArray[5] = 85;
				//print arrays
						for(int i = 0; 1 < studentsArray.length; i++) { 
							System.out.println("name: " + studentsArray[i] + " grades: " + gradesArray[i]);
					}
				//avg
				for(int i = 0 ; i < gradesArray.length; i++) {
					avg += gradesArray[i];
				}
				avg = avg/gradesArray.length;
				System.out.println("Class Avg" + avg);
			}

		
	

}
