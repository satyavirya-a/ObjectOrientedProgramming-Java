package models;

public abstract class Media {
	
	private String title, description;
	
	public Media() {
		
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
	
	public abstract void showInfo();
	
	public abstract void showShortInfo();
	
	public abstract void play();

	public abstract void showShortHistory();
	
	public abstract void resetHistory();
	
	public abstract boolean isWatched();
	
	
	
	

}
