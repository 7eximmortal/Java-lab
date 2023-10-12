package Interfaces;

public class Human implements Stalcraft.Printmoney {
	
	String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("500 денег!");
	}
	
}
