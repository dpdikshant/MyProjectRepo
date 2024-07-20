package java_basics;



public class Vehicles {
	String NameOfCar;
	String Model;
	String Color;
	int Price;
	double Horse_Power;
	
	
	
	
	



	public Vehicles(String nameOfCar, String model, String color, int price, double horse_Power) {
		super();
		NameOfCar = nameOfCar;
		Model = model;
		Color = color;
		Price = price;
		Horse_Power = horse_Power;
	}







	public static void CarCatalouge() {
		
		Vehicles CAR1 = new Vehicles("Ford Mustang 1969", "Ford", "Black", 120000, 125.9);
		Vehicles CAR2 = new Vehicles("Accord", "Honda", "White", 100000, 122.5);
		Vehicles CAR3 = new Vehicles("Seltos", "Kia", "Red", 150000, 150.00);
		Vehicles CAR4 = new Vehicles("Urban Cruiser Taisor", "Toyota", "Blue", 110000, 115.00);
		Vehicles CAR5 = new Vehicles("Verna", "Hyundai", "Silver", 210000, 201.00);
		
		System.out.println("CAR CATALOUGE"+'\n'+"CAR1 "+CAR1+'\n'+"CAR2 "+CAR2+'\n'+"CAR3 "+CAR3+'\n'+"CAR4 "+CAR4+'\n'+"CAR5 "+CAR5);		
	}

    






	@Override
	public String toString() {
		return "Vehicles [NameOfCar=" + NameOfCar + ", Model=" + Model + ", Color=" + Color + ", Price=" + Price
				+ ", Horse_Power=" + Horse_Power + "]";
	}
	
	
	
	
	
	
	
	
	

}
