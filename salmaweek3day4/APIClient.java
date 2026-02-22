package salmaweek3day4;

public class APIClient {
	
	// Method with name sendRequest but only 1 input parameter
	
	public void sendRequest(String endpoint) {
		
		System.out.println("This is the text for :"+ endpoint);
		
	}
	
	// Method with name sendRequest but only 3 input parameters
	
	public void sendRequest(String endpoint1, String requestBody, boolean  requestStatus ) {
		
		System.out.println("This is the text for :"+ endpoint1);
		System.out.println("This is the text for :"+ requestBody);
		if (requestStatus)
			
			System.out.println("The request status Passed");
		else 
			System.out.println("The request status failed");
		
	}

	
	// object to call methods with different input parameters using concept of overloading
	
	public static void main(String[]args) {
		
		APIClient assignment =new APIClient();
		assignment.sendRequest("Suspense");
		assignment.sendRequest("Comedy", "Film", true);
		
	}
}
