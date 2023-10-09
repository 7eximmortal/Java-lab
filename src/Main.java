import Inherence.*;

public class Main {
	public static void main(String args[]) {
		System.out.println("[IMMORTAL LAB] Program Started");
		
		Worker chara = new Worker("Вася");
		chara.setName("Васянчик");
		System.out.println(chara.getInfo());
	}
}