package DatabaseConnection;

import java.util.List;

import Menus.Shows;

public interface ShowsDAO  {
	
	public List<Shows> getAllShows();
	
	public List<Shows> getShowsById(int show_id); // get show_id, return all the information in that; 
	
	
	public boolean updateShows(Shows shows);
	
}
