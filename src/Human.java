

public class Human {
	
		private String name;
		Phone phone;
		
	public class Phone {
		private int number;
		
		Phone(int number) {
			this.number = number;
		}
		
		public int getNumber() {
			return this.number;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	Human(String name, int number) {
		this.name = name;
		phone = new Phone(number);
	}

}
