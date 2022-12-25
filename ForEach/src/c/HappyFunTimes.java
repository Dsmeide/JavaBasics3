package c;

import java.util.ArrayList;

public class HappyFunTimes {

	public static void main(String[] args) {
		
		String[] cars = {"BMW M2", "Veloster N", "GTI"};
		/*goes through the Array "cars" and adds them to 
		 * the newly declared String variable "car"
		 * then prints them out with sysout
		 */
		for(String car : cars) {
			System.out.println(car);
		}  
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(7);
		numbers.add(2);
		
		//for(int a : numbers) {
			//System.out.println(a);
		//}
		/*
		 * Equivilent code would be a for loop
		 */
		
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

	}

}
