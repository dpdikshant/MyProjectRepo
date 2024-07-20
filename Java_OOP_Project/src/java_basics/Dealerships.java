package java_basics;



public class Dealerships {

	public static void main(String[] args) {
		
		Vehicles.CarCatalouge();
		Vehicles V = new Vehicles("Ford Mustang", "Ford", "Black",120000 , 125.9);
		
		Customers cust1 = new Customers("Surabhi Sharma", 31, 50000, "123cccjjjjkkkk", true);
		cust1.selectedCar("CAR1");
		
		Employees Emp = new Employees();
		Emp.Customers(cust1, V, false);
		
		
		
	}

}
