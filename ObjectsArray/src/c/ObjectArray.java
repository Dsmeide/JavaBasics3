package c;
class Monkey {
	
	String type = "Spider monkey";
	
	public static void sayOohAhhAhh() {
		System.out.println("ohh ahh ahh");
	
	}
	
}

public class ObjectArray {

	public static void main(String[] args) {
		Monkey m1 = new Monkey();
		Monkey m2 = new Monkey();
		Monkey m3 = new Monkey();
		Monkey[] monkeys = {m1, m2, m3};
		
		for(Monkey m : monkeys) {
			m.sayOohAhhAhh();
		}
		
	}

}
