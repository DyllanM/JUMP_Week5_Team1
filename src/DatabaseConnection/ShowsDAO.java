package DatabaseConnection;

import java.util.List;

import Menus.Shows;

public interface ShowsDAO  {
	
	public List<Shows> getAllShows();
	
	public Shows getShowsById(int id);
	
	public boolean updateShows(Shows shows);
	
}
