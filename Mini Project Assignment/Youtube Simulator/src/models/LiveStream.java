package models;

public class LiveStream extends Media {
	
	private boolean isPlayed; 

	public LiveStream() {
		// TODO Auto-generated constructor stub
	}

	public LiveStream(String title, String description) {
		super(title, description);
		isPlayed = false;
	}

	@Override
	public void showInfo() {
		System.out.println("Now Playing: " + getTitle());
		System.out.println(getDescription());
	}

	@Override
	public void play() {
		isPlayed = true;
		showInfo();
	}

	@Override
	public void showShortInfo() {
		
		System.out.println("LiveStream: " + getTitle());
	}

	public boolean isPlayed() {
		return isPlayed;
	}

	public void setIsPlayed(boolean isPlayed) {
		this.isPlayed = isPlayed;
	}

	@Override
	public void showShortHistory() {
		showShortInfo();
	}

	@Override
	public void resetHistory() {
		isPlayed = false;
	}
	
	@Override
	public boolean isWatched() {
		return isPlayed;
	}
	
	
	
	

}
