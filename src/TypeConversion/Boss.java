package TypeConversion;

// Оператор instanceof проверяет можно ли сделать низходящие преобразование обьектов

public class Boss {
	
	String name;
	int number;
	
	public Boss(String name, int number) {
		
		this.name = name;
		this.number = number;
		
	}
	
	public void display() { System.out.println("NAME = " + this.name + " NUMBER = " + this.number); }
	
}
