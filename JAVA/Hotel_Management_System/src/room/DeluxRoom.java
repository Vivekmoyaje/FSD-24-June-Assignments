package room;

public class DeluxRoom extends Room {

	private double size;

	public DeluxRoom(String roomId, int roomNo, double roomFare, double size) {
		super(roomId, roomNo, roomFare);
		this.size = size;
	}

	@Override

	void roomInfo() {

		System.out.println("Deluxe Room  : ");
		System.out.println("Room ID      : " + super.roomId);
		System.out.println("Room Number  : " + super.roomNo);
		System.out.println("Room Fare    : " + super.roomFare);
		System.out.println("Room Size    : " + this.size);
		System.out.println();
	}

}
