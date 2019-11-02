
public class Main {

	public static void main(String[] args) {
		UserService userService=new UserService();
		userService.register("Lori","L0r1");
		userService.register("Adi","@d1");
		userService.register("Andrei","#31q");
		userService.register("Lori","1234");
		
		userService.login("Lori,"1234");

	}

}
