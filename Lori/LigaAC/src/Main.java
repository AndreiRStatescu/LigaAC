
public class Main {

	public static void main(String[] args) {
		UserService u=new UserService();
		u.register("Lori","L0r1");
		u.register("Andrei", "123");
		u.register("Adi","@d1");
		u.login("Lori", "L0r1");
		u.login("Georgica", "password");
	}

}
