package main;

//interface bikin kontrak, buat pikin behaviour (anak class waterable ini tu harus implement yang ada didalam interface
public interface Waterable { //ini biar kita gak usah pake instance instance mulu di kondisi iterasi
	public abstract void watering(); // ini abstract method
	//otomatis public abstract
}
