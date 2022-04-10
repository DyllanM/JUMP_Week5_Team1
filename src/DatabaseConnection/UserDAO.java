package DatabaseConnection;

import Menus.User;

public interface UserDAO {
	
	public User getUserByIdNPassword(int id, String password);

	public User getUserByNamePassword(String username, String password);

}
