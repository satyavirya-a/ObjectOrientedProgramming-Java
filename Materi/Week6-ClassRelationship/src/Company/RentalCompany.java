package Company;

import java.util.ArrayList;

public class RentalCompany {
	
	private String name;
	private ArrayList<Car> cars = new ArrayList<>();
	

	public RentalCompany(String name) {
		this.name = name;
	}
	
	public void addCar(Car car) {
		cars.add(car);
	}
	

}
