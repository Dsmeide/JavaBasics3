package c;

public class StringsAreFun {

	public static void main(String[] args) {
		
		//use .equals to compare objects
		//cannot compare an object and string with ==
		//when in doubt just use .equals
		
		//String a = "lemur";
		//String b = "lemur";
		
		//if(a == b) {
			//System.out.println("true");
		//} else {
			//System.out.println("false");
		
		//OR
		
		String a = new String("lemur");
		String b = new String("lemur");
		
		if(a.equals(b)) {
			System.out.println("yes");
		} else {
			System.out.println("NO");
		}

	}

}
