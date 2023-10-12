package Interfaces;

public interface Base {
	
	void display();
	
	default void eating() { System.out.println("Ира зая!"); }
	
}
