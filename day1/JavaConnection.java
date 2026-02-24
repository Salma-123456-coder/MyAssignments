package week4.day1;

public class JavaConnection implements DatabseConnection{

	public static void main(String[] args) {
		
		JavaConnection objct1=new JavaConnection();
		objct1.connect();
		objct1.disconnect();
		objct1.executeUpdate();

	}
	public void connect() {
		System.out.println("This is connect from DatabseConnection");
		
	}

	
	public void disconnect() {
		System.out.println("This is disconnect from DatabseConnection");
		
	}

	
	public void executeUpdate() {
		System.out.println("This is executeUpdate from DatabseConnection");
		
	}
	
	
	}

	


	

	

