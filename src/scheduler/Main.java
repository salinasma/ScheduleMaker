package scheduler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("started");
		File memberInput = null;
		ArrayList<Member> members = null;
		try{
			memberInput = loadInputFile();
				
		} catch(IOException e){
			System.out.println("loading the Input File went wrong. program terminated");
			System.exit(1);	
		}
		
		members = createMembers(memberInput);
		
		for(Member a : members){
			System.out.println(a.getLabor().toString());
			
		}
		
		

	}
	
	public static File loadInputFile() throws IOException{
		System.out.println("loading member input files");
		File f = new File("labor schedule.csv");
		System.out.println("finished loading member input files");
		
		return f;
	}
	
	public static ArrayList<Member> createMembers(File file) {
		System.out.println("creating members from file");
		Scanner f = null;
		try {
			f = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		ArrayList<Member> members = new ArrayList<Member>();
		
		while(f.hasNext()){
			members.add(new Member(f.nextLine(), 5));
		}
		
		
		System.out.println("Finished creating members from file");
		return members;
		
	}
	

}
