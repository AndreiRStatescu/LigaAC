import java.util.ArrayList;

//POJO Plain Old Java Object

public class User {

	private String username;

	private String password;
	
	private ArrayList<User> friends = new ArrayList<User>();

	public User(String username, String password) {
		// TODO Auto-generated constructor stub
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	public void addFriend(User friendName) {
		getFriends().add(friendName);
	}

	public ArrayList<User> getFriends() {
		return friends;
	}

	public void setFriends(ArrayList<User> friends) {
		this.friends = friends;
	}

}
