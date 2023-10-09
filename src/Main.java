import Inherence.*;

public class Main {
	public static void main(String args[]) {
		System.out.println("[IMMORTAL LAB] Program Started");
		
		Worker vlad = new Worker("Владик");
		vlad.setName("Влад");
		System.out.println(vlad.getInfo());
		
		Human vova = new Worker("Вова");
		vova.setName("Вовочка");
	}
}