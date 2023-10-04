package inheritanceDemo;

public class MethodsDemo1 {

	public void login() {
		System.out.println("Enter Username");
		System.out.println("Enter Password");
		System.out.println("Sign into mailbox");
	}

	public void ComposeEmail() {
		System.out.println("Compose an Email");
	}

	public void logout() {
		System.out.println("Click on logout button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo1 obj = new MethodsDemo1();
		obj.login();

		obj.ComposeEmail();

		obj.logout();

	}

}
