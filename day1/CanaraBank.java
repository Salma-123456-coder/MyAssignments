package week4.day1;

public abstract class CanaraBank implements Payments{
	
	
	public void cashOnDelivery() {
		System.out.println("This is cashOnDelivery from CanaraBank");
		
	}

	
	public void upiPayments() {
		System.out.println("This is upiPayments from CanaraBank");
		
	}

	
	public void cardPayments() {
		System.out.println("This is cardPayments from CanaraBank");
		
	}

	
	public void internetBanking() {
		System.out.println("This is internetBanking from CanaraBank");
		
	}

		
	
	public void recordPaymentDetails() {
		System.out.println("This is recordPaymentDetails from CanaraBank");
	}
}

