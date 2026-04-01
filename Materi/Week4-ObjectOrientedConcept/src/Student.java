
//[access modif] static abstract [return] methodname(parameter)
public class Student {
	
	//ATRIBUT
	String name, id;
	int gpa;
	

	public Student() { // kalau diapus tetep ada, tapi constructor kosong
		// TODO Auto-generated constructor stub
		System.out.println("Ini student!");
	}
	
	
	//satu class bisa punya banyak constractor
	public Student(String name) {
		this.name = name;
		System.out.println("Ini " + name); 
	}
	
	//ini constructor lengkap
//	public Student(String name, String id, int gpa2) {
//		//this ini supaya merujuk variabel di atribut
//		this.name = name;
//		this.id = id;
//		gpa = gpa2; //bisa gini tapi tidak disarankan
//	}
	
	//ADA SHORTCUT, biar gak capek capek ngetik
	// klik kanan > source > constructor
	public Student(String name, String id, int gpa) {
//		super();// ini nanti buat kalau misal ada parent
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	
	
	//constructor itu cuma bisa dipanggil sekali saat "new" kaga bisa yang lain
	//nama harus sama dengn nama class
	// tidak ada return type, tapi bisa punya parameter
	//default ny tanpa parameter

	
	
	//ini baru method
	void displayInfo() {
		System.out.println(id + "-" + name + ":" + gpa);
	}

	//ini pengganti constructor
	//automatic klik kanan > soure > getter and setter
	//alt shift s r
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getGpa() {
		return gpa;
	}


	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	
	
	//bikin setter and getter
	




}
