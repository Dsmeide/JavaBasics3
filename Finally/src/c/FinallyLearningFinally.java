package c;

import java.util.Scanner;

public class FinallyLearningFinally {

	public static void main(String[] args) {
		// try first, if exception happens then run that, 
		//then always run finally
		
		Scanner scan = new Scanner(System.in);
		
		try {
			
			System.out.println(scan.next());
			
		} catch(Exception e) {
			
			System.out.println(e);
			
		} finally {
			System.out.println("This is in 'finally', it always gets run!");
			scan.close();
		}
		
	}
}
	
