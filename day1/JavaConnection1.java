package week4.day1;

public class JavaConnection1 extends MySqlConnection {

	public static void main(String[] args) {
		
		JavaConnection1 objct2=new JavaConnection1();
		objct2.connect();
		objct2.disconnect();
		objct2.executeUpdate();
		objct2.executeQuery();

	}

	@Override
	public void connect() {
		System.out.println("This is connect from JavaConnection1");
		
	}

	@Override
	public void disconnect() {
		System.out.println("This is disconnect from JavaConnection1");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("This is executeUpdate from JavaConnection1");
		
	}

	
	@Override
	public void executeQuery() {
		System.out.println("This is executeQuery from JavaConnection1");
		
	}
}
