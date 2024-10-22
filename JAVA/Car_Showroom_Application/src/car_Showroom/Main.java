package car_Showroom;

public class Main {

	public static void main(String[] args) {
		
		Showroom showroom = new Showroom();
		showroom.set_details("BMW Showroom", "Mumbai", "Vivek Moyaje", 50, 1000);

		Cars cars = new Cars();
		cars.set_details();
		cars.get_details();

		Employee employee = new Employee();
		employee.set_details();
		employee.get_details();

		showroom.get_details();
	}

}
