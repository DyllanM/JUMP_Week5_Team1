package Menus;

public class User {
	
	private int id;
	private String user_name;
	
	
	public User(int id, String user_name) {
		super();
		this.id = id;
		this.user_name = user_name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + "]";
	}
	
	
	

}
