package turotialpackage;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListipod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		ArrayList<String> allSongs = new ArrayList<String>();
		ArrayList<String> artists = new ArrayList<>();
		
		//2
		allSongs.add("Nonstop");
		artists.add("Drake");
		allSongs.add("Dark Queen");
		artists.add("Lil Uzi Vert");
		allSongs.add("Mo Bamba");
		artists.add("Sheck Wes");
		allSongs.add("Super Saiyan");
		artists.add("Lonzo Ball");
		allSongs.add("God's Plan");
		artists.add("Drake");
		
		ArrayList<String> partyPlayList = new ArrayList<>();
		
		for(int i = 0; i < allSongs.size(); i++) {
			System.out.println(i + " " +allSongs.get(i) + " "
					+ artists.get(i));
		}
		
		System.out.println("Select menu option: \n" +
		"1. add song to library \n" +
		"2. delete song from library \n" +
		"3. add song to plarty play list");
		
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		if(choice == 1) {//add song
			input.nextLine();// clear extra enter character
			System.out.print("enter title");
			allSongs.add(input.nextLine());//store title name
			System.out.print("enter artist name");
			artists.add(input.nextLine());//store title name
		}
		else if(choice == 2) { //delete from library
			System.out.println("enter song number to delete");
			allSongs.remove((input.nextInt()-1));
			artists.remove((input.nextInt()-1));
		}
		else if(choice == 3) {//add to party list
			System.out.print("enter title of the song you would like to add");
			partyPlayList.add(allSongs.get(input.nextInt()-1));
			System.out.print(partyPlayList);
		}
		else if(choice == 4)
			System.out.print("Invalid");
		}}
			
		
		

 
