// Service =doar face chestii, nu tine minte atribute
public class UserService {
	public void register(String username,String password)
	{

		for(User user: Database.users)
		{
			if(user.getUsername().equals(username))
			{
				System.out.println("Userul cu numele "+username+ "exista deja");
				return;
			}
		}
		Database.users.add(new User(username,password));
		System.out.println("Userul cu numele "+username+ "a fost adaugat cu succes");
	}

	public void login(String username,String password) {
		for(User user: Database.users)
		{
			if(user.getUsername().equals(username))
			{
				if(user.getPassword().equals(password))
				{
					System.out.println("Hello, "+username+"!");
				}
				else
					System.out.println("Parola gresita pentru userul "+username);
			}
			return;
		}
		System.out.println("Username inexistent "+username);
	}
	public void add_friend(String currentUsername,String newFriendUsername)
	{
		for(User user: Database.users)
		{
			if(user.getUsername().equals(currentUsername))
			{
				
			}
		}
	}
}
