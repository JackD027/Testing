package inheritanceDemo;

public class Base {
	
	public void openbrowser(String browser) {
		
		System.out.println("Open the browser" + browser);
	}
	
	// Static method can be called without an Object in any class
	public static void login(String username,String password)
	{
		System.out.println("Enter Username: " + username);
		System.out.println("Enter Password: " + password);
		System.out.println("Sign into mailbox");
	}
	
	public void logout()
	{
		System.out.println("Click on logout button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
