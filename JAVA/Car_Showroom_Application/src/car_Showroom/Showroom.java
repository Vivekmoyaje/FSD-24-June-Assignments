package car_Showroom;

interface utility {

		void get_details();

		void set_details();
}

class Showroom {

	protected String showroom_name;
	protected String showroom_address;
	protected int total_emplolyee;
	protected int total_cars_in_stock;
	protected String manager_name;

	public void get_details() {

		System.out.println("\n ***** Showroom Details ***** \n");
		System.out.println("Name : " + showroom_name);
		System.out.println("Address : " + showroom_address);
		System.out.println("Manager Name : " + manager_name);
		System.out.println("Total employee : " + total_emplolyee);
		System.out.println("Total cars in stock : " + total_cars_in_stock);

	}

	public void set_details(String name, String address, String manager, int employee, int cars) {

		showroom_name = name;
		showroom_address = address;
		manager_name = manager;
		total_emplolyee = employee;
		total_cars_in_stock = cars;

	}
	
}
