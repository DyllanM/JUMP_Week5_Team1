package DatabaseConnection;

import java.util.List;


import Menus.Tracker;

public interface TrackerDAO {
	
	public List<Tracker> getAllTrackers();
	
	public List<Tracker> getTrackerByUserId(int user_id);
	
	public List<Integer> getShowIdByUserId(int user_id); 
	// ask user for user_id and return all the list of all show_id associated -- need work; 
	
	public boolean updateTrackerStatusByShowId(String status, int show_id);
	
	

}
