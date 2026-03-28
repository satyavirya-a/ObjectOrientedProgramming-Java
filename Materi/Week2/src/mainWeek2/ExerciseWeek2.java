package mainWeek2;

import java.util.*;

public class ExerciseWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String[] name = new String[100];
		String[] email = new String[100];
		String input;
		int count = 0;
		int opt;
		String max = "";
		int maxLength = 0;
		
		do {
			System.out.println("EMPLOYEE MANAGEMENT MENU");
			System.out.println("1. Insert employee data");
			System.out.println("2. View all employees");
			System.out.println("3. Exit");
			System.out.print(">> ");
			opt = sc.nextInt();
			sc.nextLine();
			switch (opt) {
			case 1: 
				while(true) {
					
					System.out.print("Enter employee (name;email): ");
					input = sc.nextLine();
					String[] temp = input.split(";"); //temp.length itu jumlah data di array
														//temp[].length() itu panjang string
					if (temp.length != 2) {
						System.out.println("Data email tidak ada");
						continue;
					}	
					if (!(temp[1].contains("@"))) {
						System.out.println("Invalid email! Must contain '@'.");
						continue;
					}
					name[count] = temp[0];
					email[count] = temp[1];
					
					
					if (name[count].length() > maxLength) {
						maxLength = name[count].length();
						max = name[count];
					}
					count++;
					System.out.println("Data saved. Enter to back to menu");
					 sc.nextLine();
					 break;
				} 
				break;
			case 2:
				if (count == 0) {
					System.out.println("No Data yet, enter to back to menu");
					sc.nextLine();
					continue;
				}
				System.out.println("List of Employees:");
				for (int i = 0; i < count; i++) {
					System.out.println( (i+1) +". " + name[i] + " - " + email[i]);
				}
				System.out.println();
				System.out.println("Total employees: " + count);
				System.out.println("Longest name: "  + max.toUpperCase() + " (" + maxLength + " characters)");
				System.out.println("Enter to back to menu");
				sc.nextLine();
				break; 
			case 3:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Salah Input, coba lagi");
			}
			
					
		} while (opt != 3);

		
		sc.close();
	}

}
