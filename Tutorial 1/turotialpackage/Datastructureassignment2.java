package turotialpackage;

public class Datastructureassignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] NameArray = {"Bradley","Angel","Brix","Stefano","Gio","Shane"}; //array of names
		int[] gradeNum = {11,11,10,11,12,12}; //which grade the students are in
		int[] exam1 = {65,96,22,67,78,70}; //first exam marks
		int[] exam2 = {95,97,51,63,46,95}; //second exam marks
		int[] exam3 = {61,86,80,24,65,78}; //third exam marks
		
		System.out.println("Name: " + NameArray[0]); //prints name of first student
		System.out.println("Grade: " + gradeNum[0]); //prints grade of first student
		System.out.println("Exam 1: " + exam1[0]); //prints mark of first exam
		System.out.println("Exam 2: " + exam2[0]); //prints mark of second exam
		System.out.println("Exam 3: " + exam3[0]); //prints mark of third exam
		
		System.out.println();
		
		System.out.println("Name: " + NameArray[5]); //prints name of last student
		System.out.println("Grade: " + gradeNum[5]); //prints grade of last student
		System.out.println("Exam 1: " + exam1[5]); //prints the mark of first exam
		System.out.println("Exam 2: " + exam2[5]); //prints the mark of second exam
		System.out.println("Exam 3: " + exam3[5]); //prints the mark of third exam
		
		System.out.println();
		for(int i = 0; i < NameArray.length; i++) { //prints out all the students names
			System.out.println(NameArray[i]);// Prints Out the names
		}
		
		System.out.println();
		for(int i = 0; i < NameArray.length; i++) { //prints out all the students names, grades, and exam marks
			System.out.println(NameArray[i] + " " + gradeNum[i] + " " + exam1[i] + " " + exam2[i] + " " + exam3[i]); // Prints out the students name, grade, and their exam grade from exams 1,2 and 3
		}
		
		System.out.println();
		for(int i = 0; i < NameArray.length; i++) { //prints all students names, grades, and exam marks along with their number order in NameArray
			System.out.println((i + 1) + " " + NameArray[i] + " " + gradeNum[i] + " " + exam1[i] + " " + exam2[i] + " " + exam3[i]); //Prints out the students name, grades, and from exam 1,2 and 3
		}
		
		System.out.println();
		System.out.println("/*********************Next 30%***********/"); // Prints out the next 30%
		
		for(int i = 0; i < NameArray.length; i++) { //prints out the average of each student's marks from exam
			int sum = exam1[i] + exam2[i] + exam3[i]; //sum of all 3 exams
			int avg = sum / 3;// divides the sum by the amount of exams (3 exams)
			System.out.println("The average of: " + NameArray[i] + " is " + avg); // Prints out the students average
		}
		
		System.out.println();//Used for spacing
		System.out.println("/*********************Next 30%***********/"); // Prints out the next 30%
		
		for(int i = 0; i < NameArray.length; i++) {//prints students names that have a higher mark than 60 on exam 3
			if(exam3[i] > 60) {//if grade is higher than 60 continue
				System.out.println("Student: " + NameArray[i] + " got a grade higher than 60 on exam 3");	//tells student their name and when they got a higher mark than 60
			}
		}
		
		for(int i = 0; i < NameArray.length; i++) {	//prints students name that have lower mark than 50
			if(exam1[i] > 50) {	//if grade is lower than 50 continue
				exam1[i] = 30;	//changes grade to 30
				System.out.println("Student: " + NameArray[i] + " Exam 1 mark lower than 50, changed to: " + exam1[i]); //Prints words inside the brackets +  the values of variables inside brackets
			}
		}


	}
}

