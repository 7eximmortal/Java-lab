package Inherence;

// ключевое слово final запрещает наследование класса
// что бы сделать метод или класс статическим, используется ключевое слово static

// в java есть динамаическая диспечеризация классов, можно указать тип суперкласса
// и при этом ссылаться на подкласс, т.к подкласс является одновременно основным классом, java
// поймет и сделает диспетчеризацию

public class Human {
	private String name;
	private int age;
	
	public Human(String name) {
		
		this.name = name;
		
	}
	
	public String getName() { return name; }
	
	public void setName(String name) { this.name = name; }
	
	public String getInfo() { return "Всем привет!"; }
	
}
