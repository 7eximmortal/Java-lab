import TypeConversion.*;

public class Main {
	public static void main(String args[]) {
		System.out.println("[IMMORTAL LAB] Program Started");
		
		Object sasha = new Client("Дядя Саша", 213);
		if(sasha instanceof Client sashaNew) {
			sashaNew.display();
		} else {
			System.out.println("Нельзя выполнить преобразование!");
		}
	}
}