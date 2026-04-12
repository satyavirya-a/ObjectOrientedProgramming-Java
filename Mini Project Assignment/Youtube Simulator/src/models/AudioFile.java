package models;

public class AudioFile extends Media implements File {
	
	private int currPlay;

	public AudioFile() {
		// TODO Auto-generated constructor stub
	}

	public AudioFile(String title, String description, int duration) {
		super(title, description, duration);
		currPlay = 0;
		
	}
	
	public String durationCount(int duration) {
		int minute = duration / 60;
		int second = duration % 60;
		return String.format("%02d", minute)+":"+String.format("%02d", second);
	}
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Now Playing: " + getTitle());
		System.out.println(getDescription());
		showDuration();
	}

	public void showDuration() {
		if (currPlay > getDuration()) {
			System.out.println("Durasi sudah Maksimum, tetap di durasi maksimal");
			currPlay = getDuration();
		}
		else if (currPlay < 0) {
			System.out.println("Durasi sudah Minimal, kembali ke 00:00");
			currPlay = 0;
		}
		System.out.println("Current play at " + durationCount(currPlay) + "/"+ durationCount(getDuration()));
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		currPlay += 10;
		
		showInfo();
	}
	
	

	@Override
	public void skipForward() {
		currPlay += 5;
	
		showInfo();
	}

	@Override
	public void skipBackward() {
		currPlay -= 5;
		
		showInfo();
	}

	@Override
	public void showShortInfo() {
		// TODO Auto-generated method stub
		System.out.println("Audio: " + getTitle() + " (" + durationCount(getDuration()) + ")");
	}
	
	

	public int getCurrPlay() {
		return currPlay;
	}

	public void setCurrPlay(int currPlay) {
		this.currPlay = currPlay;
	}

	@Override
	public void showShortHistory() {
		// TODO Auto-generated method stub
		System.out.println("Audio: " + getTitle() + " (played at " + durationCount(currPlay) + ")");
	}
	
	
	
	

}
