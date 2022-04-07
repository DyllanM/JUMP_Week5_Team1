package Menus;

public class Tracker {
	
	private int tracker_id;
	private int show_id;
	private int user_id;
	private String status;
	
	public Tracker(int tracker_id, int show_id, int user_id, String status) {
		super();
		this.tracker_id = tracker_id;
		this.show_id = show_id;
		this.user_id = user_id;
		this.status = status;
	}

	public int getTracker_id() {
		return tracker_id;
	}

	public void setTracker_id(int tracker_id) {
		this.tracker_id = tracker_id;
	}

	public int getShow_id() {
		return show_id;
	}

	public void setShow_id(int show_id) {
		this.show_id = show_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
