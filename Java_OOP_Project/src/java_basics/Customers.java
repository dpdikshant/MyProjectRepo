package java_basics;

public class Customers {
	
	private String name;
	private int age;
	private double cash;
	private String address;
	private boolean Haveajob;
	
	




	
	public Customers(String name, int age, double cash, String address, boolean haveajob) {
		super();
		this.name = name;
		this.age = age;
		this.cash = cash;
		this.address = address;
		Haveajob = haveajob;
	}
	
	




	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public int getAge() {
		return age;
	}






	public void setAge(int age) {
		this.age = age;
	}






	public double getCash() {
		return cash;
	}






	public void setCash(double cash) {
		this.cash = cash;
	}






	public String getAddress() {
		return address;
	}






	public void setAddress(String address) {
		this.address = address;
	}






	public boolean isHaveajob() {
		return Haveajob;
	}






	public void setHaveajob(boolean haveajob) {
		Haveajob = haveajob;
	}






	public void PurchasedCar(Vehicles vehicle,Employees emp, boolean Finance) {
		
	}
	
	
	
	 public void selectedCar(String select) {
		 
		 
		 Vehicles CAR1 = new Vehicles("Ford Mustang 1969", "Ford", "Black", 120000, 125.9);
			Vehicles CAR2 = new Vehicles("Accord", "Honda", "White", 100000, 122.5);
			Vehicles CAR3 = new Vehicles("Seltos", "Kia", "Red", 150000, 150.00);
			Vehicles CAR4 = new Vehicles("Urban Cruiser Taisor", "Toyota", "Blue", 110000, 115.00);
			Vehicles CAR5 = new Vehicles("Verna", "Hyundai", "Silver", 210000, 201.00);
		 
	    	
	    	if (select=="CAR1") {
	    		System.out.println("\n CAR Selected "+CAR1);
	    	}else if(select=="CAR2") {
	    		System.out.println("\n CAR Selected "+CAR2);
	    	}else if(select=="CAR3") {
	    		System.out.println("\n CAR Selected "+CAR3);
	    	}else if(select=="CAR4") {
	    		System.out.println("\n CAR Selected "+CAR4);
	    	}else if(select=="CAR5") {
	    		System.out.println("\n CAR Selected "+CAR5);
	    	}else {
	    		System.out.println("\n CAR ID Dosen't Exist");
	    	}
	    }




	@Override
	public String toString() {
		return "Customers [name=" + name + ", age=" + age + ", cash=" + cash + ", address=" + address + ", Haveajob="
				+ Haveajob + "]";
	}
	
	
	

}
