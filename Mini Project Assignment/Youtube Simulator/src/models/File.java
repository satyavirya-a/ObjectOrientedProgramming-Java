package models;

public interface File {
	
	void skipForward();
	
	void skipBackward();
	
	int getCurrPlay(); //biar bisa diakses kalau pakai instance of FILE
	
	void setCurrPlay(int currPlay);
	
	void showShortHistory();
}
