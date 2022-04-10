package DatabaseConnection;

import Menus.User;

public interface UserDAO {
	
	public User getUserByIdNPassword(int id, String password);
	

}
