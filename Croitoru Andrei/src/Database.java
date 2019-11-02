import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Database {

	public static ArrayList<User> users = new ArrayList<User>();
	

	// [(A, B), (B, D), (B, E), ...]
	// timp O(nr de prietenii)
	// memorie O(nr de prietenii)
	
	
	//	A -> [B]
	//  B -> [D, E]
	// timp O(log(nr de useri) * O(nr de prieteni ai userului cautat))
	// memorie O(nr de prietenii)
	
	//   A   B   C   D  E
	//A      1
	//B              1  1
	//C
	//D
	// timp O(log (nr de useri)) 
	// memorie O(nr useri * nr useri)
}
