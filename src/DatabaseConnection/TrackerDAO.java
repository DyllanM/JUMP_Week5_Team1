package DatabaseConnection;

import java.util.List;


import Menus.Tracker;

public interface TrackerDAO {
	
	public List<Tracker> getAllTrackers();
	
	public boolean getTrackerByUserId(int user_id);
	
	public boolean updateTrackerStatus(String new_status);
	
	

}
