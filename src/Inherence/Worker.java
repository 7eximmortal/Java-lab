package Inherence;

public class Worker extends Human {
	
	public Worker(String name) {
		super(name);
	}
	
	@Override 
	public String getInfo() { return "Переопределение, всем пока!"; }
}
