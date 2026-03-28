
// DI JAVA TIDAK ADA POINTER, langsung ke ganti nanti dia

//Kalau STATIC nempel di CLASS
//kalau engga, harus bikin OBJECT dulu baru bisa dipake methodnya


//RECORD -> sekalinya assign, dia tidak berubah (immutable)

import java.util.ArrayList;

public class MainWeek4 {
	
	//ngakalin biar kaga harus static doang
	public MainWeek4() {
		
		Student st1 = new Student();
		st1.id = "234B";
		st1.name = "Duit";
		st1.gpa = 264;
		Student st2 = new Student("NASI");
		
		test(st2); //update nama di st2
		System.out.println(st2.name);
		
		
		//PENGGUNAAN DI ARRAY LIST
		ArrayList<Student> students = new ArrayList<>();
		students.add(st2);
		students.add(st1);
		students.add(new Student("Ayam", "123A", 27));
		for (Student student : students) {
			student.displayInfo();
		}
	}

	//ketika di compile, harusnya langsung di cari public static void main
	public static void main(String[] args) {
		
		new MainWeek4(); //manggil constructor main week4, biar gak harus static static
		
	}
	
	//method static harus panggil static juga, 
	void test(Student st) {
		st.name = "Halo" + st.name;
	}

}
