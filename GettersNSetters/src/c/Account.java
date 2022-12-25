package c;
//intro to getters and setters
public class Account {
	
	String name;
	int age;

	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setName("Pablo");
		a.setAge(34);
		System.out.println(a.getName());
		System.out.println(a.getAge());
		
		a.printDetails();
		
	}
	//dont forget about the shortcut to auto generate these getters and setters with right click
	//and source
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public void printDetails() {
		System.out.println(name + ", " + age);
	}

}
