package salmaweek3day4;

public class Methodoverloading {

	public void reportStep(String message,String status) {
		
		System.out.println("Training is going good: "+ message);
		System.out.println("I can pass the exams: "+ status);
	
	}
	
	public void reportStep(String message,String status,boolean snap) {
		
		System.out.println("Training is going good: "+ message);
		System.out.println("I can pass the exams: "+ status);
		
		if (snap)
		System.out.println("Snapshot taken: Yes");
		else
			System.out.println("Snapshot taken: No");
	}
	
	public static void main (String[]args) {
		
		Methodoverloading show=new Methodoverloading();
		show.reportStep("for Selenium Testing", "well");
		show.reportStep("for Manual Testing", "well", true);
		
		
				
	}
	
}