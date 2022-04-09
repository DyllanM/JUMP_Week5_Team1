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
		List<Shows> allShowsList = new ArrayList<Shows>();
		String getAllShowsQuery = "SELECT * FROM shows;";
		
		try {
			pstmt = conn.prepareStatement(getAllShowsQuery);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int show_id = rs.getInt("show_id");
				String show_name = rs.getString("show_name");
				String category = rs.getString("category");
				shows = new Shows(show_id, show_name, category);
				
				allShowsList.add(shows);
				
			}
			return allShowsList;
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return allShowsList;
	}

	@Override
	public List<Shows> getShowsById(int show_id) {
		
		List<Shows> showsList = new ArrayList<Shows>();
		String getShowsByIdQuery = "SELECT * FROM shows WHERE show_id=?;"; 
		
		try {
			pstmt = conn.prepareStatement(getShowsByIdQuery);
			
			pstmt.setInt(1, show_id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("show_id");
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
	public boolean updateShows(Shows shows) {
		// TODO Auto-generated method stub
		return false;
	}

}
