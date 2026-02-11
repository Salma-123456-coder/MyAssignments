package salmaweek2day3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyName= "TestLeaf";
		
		char[] charArray = companyName.toCharArray();
		
		System.out.println(charArray);
		
		for (int i = charArray.length-1;i>=0; i--) {
			
			System.out.println(charArray[i]);
		}

	}

}
