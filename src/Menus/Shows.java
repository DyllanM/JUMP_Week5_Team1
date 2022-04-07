package Menus;

public class Shows {

	private int show_id;
	private String show_name;
	private String category;
	
	public Shows(int show_id, String show_name, String category) {
		super();
		this.show_id = show_id;
		this.show_name = show_name;
		this.category = category;
	}

	public int getShow_id() {
		return show_id;
	}

	public void setShow_id(int show_id) {
		this.show_id = show_id;
	}

	public String getShow_name() {
		return show_name;
	}

	public void setShow_name(String show_name) {
		this.show_name = show_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
