import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		System.out.println("Program Started");
		
		ObjectMethodStd person = new ObjectMethodStd();
		person.name = "Владик";
		System.out.println(person.name);
		changeName(person);
		System.out.println(person.name);

	}
	
	public static void changeName(ObjectMethodStd p) {
		p.name = "Персик";
	}
}