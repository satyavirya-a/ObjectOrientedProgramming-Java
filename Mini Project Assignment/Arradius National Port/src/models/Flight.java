package models;

public class Flight {
	private String name;
	private String keberangkatan;
	private String destinasi;
	private String jamBerangkat;
	private int waktu;
	private int pEkonomi;
	private int pBisnis;
	private int pFirst;
	
	
	public Flight(String name, String keberangkatan, String destinasi, String jamBerangkat, int waktu, int pEkonomi,
			int pBisnis, int pFirst) {
		this.name = name;
		this.keberangkatan = keberangkatan;
		this.destinasi = destinasi;
		this.jamBerangkat = jamBerangkat;
		this.waktu = waktu;
		this.pEkonomi = pEkonomi;
		this.pBisnis = pBisnis;
		this.pFirst = pFirst;
	}
	
	public void displayFlightInfo() {
		
		
	}
	
	

}
