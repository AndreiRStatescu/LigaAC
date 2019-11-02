// Service - doar face chestii, nu tine minte atribute

public class UserService {

	public void register(String username, String password) {

//		for (int i = 0; i < Database.users.size(); i++) {
//			if (Database.users.get(i).getUsername().equals(username)) {
//
//			}
//		}

		for (User user : Database.users) {
			if (user.getUsername().equals(username)) {
				System.out.println("User " + username + " already exists");
				return;
			}
		}
		Database.users.add(new User(username, password));
		System.out.println(username + " was added successfully");

	}

	public void login(String username, String password) {
		// TODO Auto-generated method stub
		for (User user : Database.users) {
			if (user.getUsername().equals(username)) {
				if (user.getPassword().equals(password)) {
					System.out.println("Hello " + username + "!");
				} else {
					System.out.println("Incorrect password for user " + username);
				}
				return;
			}
		}
		System.out.println("User does not exist");
	}

	public void addFriend(String username, String friendUsername) {
		for (User user : Database.users) {
			if (user.getUsername().equals(username)) {
				User friend = this.getUserByName(friendUsername);
				if (friend != null) {
					user.addFriend(friend);
					System.out.println("Friend " + friend.getUsername() + " added successfully ");
				}
			}
		}
	}

	private User getUserByName(String username) {
		for (User user : Database.users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		System.out.println("This friend does not exist");
		return null;
	}

	public void friendCheck(String username) {
		for (User user : Database.users) {
			if (user.getUsername().equals(username)) {
//				for (int i = 0; i < user.getFriends().size(); i++) {
//					System.out.println(username + " and " + user.getFriends().get(i).getUsername() + " are friends");
//				}

				for (User friends : user.getFriends()) {
					System.out.println(username + " and " + friends.getUsername() + " are frineds");
				}

				if (user.getFriends().size() == 0) {
					System.out.println(username + " does not have friends");
				}
				return;
			}
		}
		System.out.println("Invalid username");
	}

}
