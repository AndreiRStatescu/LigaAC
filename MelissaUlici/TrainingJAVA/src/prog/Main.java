package prog;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService=new UserService();
		userService.register("Lori", "L0r1");
		userService.register("Adi", "@d1");
		userService.register("Andrei", "#31");
		userService.register("Lori", "L0r1");
		
		userService.register("Adi", "132");
		
		userService.add_friends("Adi", "Lori");
		userService.add_friends("Adi", "Andrei");
		
		userService.add_friends("Adi", "Andreii");
		userService.add_friends("Adii", "Andrei");
		
		userService.add_friends("Adi", "Andrei");
	}
}


