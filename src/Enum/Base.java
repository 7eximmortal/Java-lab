package Enum;

public class Base {
	Type typeGame;
	
	public Base(Type typeGame) {
		this.typeGame = typeGame;
	}
	
	public Type getType() {
		return this.typeGame;
	}
	
	public void displayInfo() {
		Type[] types = Type.values();
		for (Type s : types) {
			System.out.println(s);
		}
	}
}