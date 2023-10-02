package stdPackage;

public class AccessModifierStd {
	private String name;
	private int age;
	private String city;
	private String country;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	AccessModifierStd() {
	}
	AccessModifierStd(String name) {
		this.name = name;
	}
	AccessModifierStd(String name, int age) {
		this.name = name;
		this.age = age;
	}
	AccessModifierStd(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	AccessModifierStd(String name, int age, String city, String country) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.country = country;
	}
}
