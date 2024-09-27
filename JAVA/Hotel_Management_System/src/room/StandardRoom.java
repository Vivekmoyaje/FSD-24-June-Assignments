package room;

public class StandardRoom extends Room {

	private boolean acAvailabily;

	public StandardRoom(String roomId, int roomNo, double roomFare, boolean acAvailabily) {
		super(roomId, roomNo, roomFare);
		this.acAvailabily = acAvailabily;
	}

	@Override

	void roomInfo() {

		System.out.println("Standard Room Info   : ");
		System.out.println("Room ID              : " + super.roomId);
		System.out.println("Room Number          : " + super.roomNo);
		System.out.println("Room Fare            : " + super.roomFare);
		System.out.println("Room Ac Availability : " + this.acAvailabily);
		System.out.println();
	}
}
