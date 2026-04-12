package models;

public abstract class Media {
	
	private String title, description;
	private int duration;
	
	public Media() {
		
	}

	public Media(String title, String description, int duration) {
		super();
		this.title = title;
		this.description = description;
		this.duration = duration;
	}
	
	
	public Media(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public abstract void showInfo();
	
	public abstract void showShortInfo();
	
	public abstract void play();
	
	
	
	

}
