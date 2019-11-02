package pack;
//Service=doar face chestii, nu tine minte atribute, ia dintr-o parte, da in altul
public class UserService {
	public void register(String username, String password)
	{
		for (User user: Database.users)
		{
			if (user.getUsername().equals(username))
			{
				System.out.println("Userul cu numele "+username+" eixsta deja");
				return;
			}}
			Database.users.add(new User(username, password));
	}
	
	public void login(String username,String password)
	{
		for (User user: Database.users)
		{
			if (user.getUsername().equals(username))
			{
			if (user.getPassword().equals(password))
			{
				System.out.println("Hello, "+username+"!");
			}
			else
			{
				System.out.println("Parola gresita pt user-ul "+"username");
			}
			return;
		}
	}
	System.out.println("Userul "+username+" nu exista");
}
	public void add_friend(String currentUsername, String newFriendUsername)
	{
		for (User user: Database.users)
		{
			if (user.getUsername().equals(currentUsername))
			{
				for (User user1: Database.users)
				{
					if (user.getFriends().equals(newFriendUsername))
					{
						System.out.println("Persoana exista deja.");
					}
					else
						user.getFriends().add(user1);
				}
			}
		}
	}
}

