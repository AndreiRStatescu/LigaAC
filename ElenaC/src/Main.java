
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserService();
		userService.register("Lori", "L0r1");
		userService.register("Adi", "@di");
		userService.register("Andrei", "#31q");
		userService.register("Lori", "1234");
		
		userService.login("Lori", "L0r1");
		userService.login("Andrei", "L0r1");
		userService.login("Georgica", "L0r1");
		
		userService.addFriend("Lori", "Andrei");
		userService.addFriend("Lori", "Georgica");
		
		userService.friendCheck("Lori");
		userService.friendCheck("Adi");
		userService.friendCheck("Georgica");
	}

}
