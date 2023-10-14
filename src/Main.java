import Generalization.*;

public class Main {
	public static void main(String args[]) {
		
		Account<Integer> p = new Account<Integer>(5000, 50000);
		System.out.println(p.getSum());
	}
}