package DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Menus.User;

public class UserSql implements UserDAO{
	
	private static Connection conn;
    static {
        conn = ConnectionManager.getConnection();
    }
    PreparedStatement pstmt;
    ResultSet rs; 
    static User user;
    

	@Override
	public User getUserByIdNPassword(int id, String password) {
		
		String getUserQuery = "SELECT * FROM users WHERE user_id = ? AND user_password = ?;";
		
		try {
			pstmt = conn.prepareStatement(getUserQuery);
			
			pstmt.setInt(1, id);
			pstmt.setString(2, password);
			
		
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int user_id = rs.getInt("user_id");
				String username = rs.getString("username");
				user = new User(user_id, username);
			
			}
			if(user==null) {
				System.err.println("Password Does Not Match! or No Such a User ");
			}
			

		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}

}
