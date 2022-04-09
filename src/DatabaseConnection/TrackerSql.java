package DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Menus.Shows;
import Menus.Tracker;

public class TrackerSql implements TrackerDAO {
	
	private static Connection conn;
    static {
        conn = ConnectionManager.getConnection();
    }
    PreparedStatement pstmt;
    static Tracker tracker; 
	
    @Override
	public List<Tracker> getAllTrackers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tracker> getTrackerByUserId(int user_id) {
		
		String getTrackerByUserId = "SELECT * FROM trackers WHERE user_id =?;";
		List<Tracker> trackerList = new ArrayList<Tracker>();
		try {
			pstmt = conn.prepareStatement(getTrackerByUserId);
			
			pstmt.setInt(1, user_id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int tracker_id = rs.getInt("tracker_id");
				String watch_status = rs.getString("watch_status");
				int userId = rs.getInt("user_id");
				int show_id = rs.getInt("show_id");
			
				tracker= new Tracker(tracker_id, show_id, userId, watch_status);
				trackerList.add(tracker);
			}
			
			
		}catch(SQLException e) {
			System.err.println("Failed to fetch data");
		}
		
		return trackerList;
	}

	
	@Override
	public List<Integer> getShowIdByUserId(int user_id) {
		List<Integer> showIdList = new ArrayList<Integer>();
		
		String getShowIdByUserId = "select show_id from trackers where user_id = ?;";
		try {
			pstmt = conn.prepareStatement(getShowIdByUserId);
			
			pstmt.setInt(1, user_id);
			ResultSet rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				int show_id = rs.getInt("show_id");
				showIdList.add(show_id);
			
			}
			
			return showIdList;
			
			
		}catch(SQLException e) {
			System.err.println("Failed to fetch show IDs from tracker table");
		}
		return showIdList;
	}

	
	@Override
	public boolean updateTrackerStatusByShowId(String status, int show_id) {
		
		String updateTrackerStatusByShowIdQuery = "UPDATE trackers SET watch_status=? WHERE show_id= ?;";
		
		try {
			pstmt = conn.prepareStatement(updateTrackerStatusByShowIdQuery); 
			pstmt.setString(1, status);
			pstmt.setInt(2, show_id);
			
			int count = pstmt.executeUpdate();
			
			if(count> 0) {
				return true;
			}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	
}
