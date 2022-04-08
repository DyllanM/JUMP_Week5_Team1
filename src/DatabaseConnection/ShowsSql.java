package DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Menus.Shows;

public class ShowsSql implements ShowsDAO{
	
	private static Connection conn;
    static {
        conn = ConnectionManager.getConnection();
    }
    PreparedStatement pstmt;
    static Shows shows; 
    
    
	@Override
	public List<Shows> getAllShows() {
		List<Shows> showsList = new ArrayList<Shows>();
		String getAllShowsQuery = "SELECT * FROM shows;";
		
		try {
			pstmt = conn.prepareStatement(getAllShowsQuery);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int show_id = rs.getInt("show_id");
				String show_name = rs.getString("show_name");
				String category = rs.getString("category");
				shows = new Shows(show_id, show_name, category);
				
				showsList.add(shows);
				
			}
			return showsList;
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return showsList;
	}

	@Override
	public Shows getShowsById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateShows(Shows shows) {
		// TODO Auto-generated method stub
		return false;
	}

}
