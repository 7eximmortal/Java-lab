package AbstractClass;

public class Boss extends Example {
	
	int number;
	
	public Boss(int number) {
		this.number = number;
	}
	
	@Override
	public int getNumber() { return this.number; }

}
