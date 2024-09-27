package room;

public class HotelMain {

	public static void main(String[] args) {

		DeluxRoom deluxRoom = new DeluxRoom("delux-12", 11, 1200.50, 35.25);
		deluxRoom.roomInfo();

		StandardRoom standardRoom = new StandardRoom("Standard-22", 11, 1200.50, true);
		deluxRoom.roomInfo();

		Customer customer = new Customer("12", "Vivek", "8010109277", deluxRoom);
		customer.show();

	}

}
