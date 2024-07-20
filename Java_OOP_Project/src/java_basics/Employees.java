package java_basics;

public class Employees  {
	





	

	public void Customers(Customers cust, Vehicles V, boolean Finance) {
		
		if (Finance==true) {
			if(cust.isHaveajob()==false) {
				System.out.println("Not Eligibile For Loan");
			}else {
			
		
				
				double loan = V.Price-cust.getCash();
				runCreditHistory(cust, loan);
			}
				
			}else if(cust.getCash()>=V.Price) {
			System.out.println("\nCar Purchased");
		}else {
			System.out.println("\nGet more moeny");
		}
		
	}
		
	
	
	


	private static void runCreditHistory(java_basics.Customers cust, double loan) {
		System.out.println("\nRan Credit history Customer...");
		System.out.println("\nCustomer has been approved to have a loan to purchase the vehicle");
		
	}
	
	


}
