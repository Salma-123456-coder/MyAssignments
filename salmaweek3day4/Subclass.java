package salmaweek3day4;

public class Subclass extends Superclass{
	
public void NameoftheCar() {
	
	    super.NameoftheCar();
		System.out.println("Kia");
	}
	
	public static void main (String[]args) {
	
		Subclass Model=new Subclass();
		Model.NameoftheCar();
		
		
	}
	
		
		

}
