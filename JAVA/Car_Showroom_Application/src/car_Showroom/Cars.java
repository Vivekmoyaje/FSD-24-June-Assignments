package car_Showroom;

import java.util.Scanner;

class Cars extends Showroom implements utility {

	private String car_name;
	private String car_color;
	private String car_fuel_type;
	private double car_price;
	private String car_type;
	private String car_transmission;

	@Override

	public void get_details() {

		System.out.println("***** Car Details  ****** \n");
		System.out.println("Name : " + car_name);
		System.out.println("Color : " + car_color);
		System.out.println("Fuel Type : " + car_fuel_type);
		System.out.println("Price : " + car_price);
		System.out.println("Car Type : " + car_type);
		System.out.println("car Transmission : " + car_transmission);
		System.out.println("\n--------------------------------------------------------\n");

	}

	@Override
	public void set_details() {

		Scanner input = new Scanner(System.in);
		
		System.out.println("\n*** Enter Cars Details *** \n");

		System.out.print("Enter Car Name : ");
		car_name = input.nextLine();

		System.out.print("Enter Car Color : ");
		car_color = input.nextLine();

		System.out.print("Enter Car Fuel Type (Petrol / Diesel) : ");
		car_fuel_type = input.nextLine();

		System.out.print("Enter Car Price : ");
		car_price = input.nextDouble();
		input.nextLine();

		System.out.print("Enter Car Type (Sedan,SUV,Hatchback,etc) : ");
		car_type = input.nextLine();

		System.out.print("Enter Car Transmission (Automation / Manual) : ");
		car_transmission = input.nextLine();

		System.out.println("\n--------------------------------------------------------------\n");

	}

}
