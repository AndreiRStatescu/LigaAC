package prog;
//import java.util.ArrayList;

public class UserService {

		public void register(String username, String password)
		{
			for(User user : Database.users)
			{
				if(user.getUsername().equals(username))
				{
					System.out.println("Userul cu numele "+ username+ " exista deja!");
					return;
				}
			}
			
			Database.users.add(new User(username,password));
			System.out.println("Userul cu numele "+ username+" a fost adaugat cu succes!");
		}
		
		public void login(String username, String password)
		{
			for(User user : Database.users)
			{
				if(user.getUsername().equals(username))
				{
					if(user.getPassword().equals(password))
					{
						System.out.println("Hello, "+username+" !");
					}
					else
					{
						System.out.println("Parola este gresita pentru userul "+username+" !");
					}
					return;
				}
				System.out.println("Username-ul"+username+" este inexistent!");
			}
		}
		
		public void add_friends(String currentUsername,String newFriendUsername)
		{
			for (User user: Database.users)
			{
				if (user.getUsername().equals(currentUsername))
				{
					for (User newFriend : Database.users)
					{
						if(newFriend.getUsername().equals(newFriendUsername))
						{
							if(checkFriendship(user, newFriend))
							{
								System.out.println(String.format("Userul %s este deja prietenul userului %s", currentUsername, newFriendUsername));
								return;
							}
							user.getFriends().add(newFriend);
							System.out.println(user.getFriends());
							return;
						}
					}
					System.out.println(String.format("Userul %s nu exista", newFriendUsername));
					return;
				}
			}
			System.out.println(String.format("Userul %s nu exista", currentUsername));
		}
		public boolean checkFriendship(User currentUsername, User newFriendUsername)
		{
			for (User user : currentUsername.getFriends())
				if(user.getUsername().equals(newFriendUsername.getUsername()))
				{
					return true;
				}
			return false;
		}
	}