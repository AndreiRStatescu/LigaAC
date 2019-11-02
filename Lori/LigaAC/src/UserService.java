
public class UserService {

	public void register(String username, String password) {
		for(User user: Database.users) {
			if(user.getUsername().equals(username)) {
				System.out.println("User-ul cu numele " + username + " exista deja!");
				return;
			}
		}
		Database.users.add(new User(username, password));
		System.out.println("User-ul cu numele " + username + " a fost adaugat");
	}
	
	public void login(String username, String password) {
		for(User user:Database.users) {
			if(user.getUsername().equals(username)) {
				if(user.getPassword().equals(password)) {
					System.out.println("Hello, "+ username + "!");
				} else {
					System.out.println("Parola este gresita pt user-ul: "+username);
				}
				return;
			}
		}
		System.out.println("User inexistent "+ username);
	}
	
}
