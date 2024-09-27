package room;

public class Customer extends Person {

	private Room room; // has-a relation

	public Customer(String id, String name, String contactNo, Room room) {
		super(id, name, contactNo);
		this.room = room;

	}

	@Override

	void show() {

		System.out.println("Customer Info         : ");
		System.out.println("Customer ID           : " + super.id);
		System.out.println("Customer Name         : " + super.name);
		System.out.println("Customer contact No.  : " + super.contactNo);
		System.out.println("Customer Room ID      : " + room.roomId);
	}

}
