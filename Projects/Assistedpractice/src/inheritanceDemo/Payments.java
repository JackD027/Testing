package inheritanceDemo;

public class Payments extends HomePage {

	public void payments() {
		System.out.println("test payments page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payments obj = new Payments();
		obj.openbrowser("Chrome"); // Base class
		login("admin", "admin@123"); // Base class
		obj.Homepagetest(); // homepage class
		obj.payments(); // current class
		obj.logout(); // base class

	}

}
