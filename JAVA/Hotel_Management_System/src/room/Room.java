package room;

public abstract class Room {

	protected String roomId;
	protected int roomNo;
	protected double roomFare;

	// parameter constructor

	public Room(String roomId, int roomNo, double roomFare) {
		this.roomId = roomId;
		this.roomNo = roomNo;
		this.roomFare = roomFare;
	}

	// getters and setters

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public double getRoomFare() {
		return roomFare;
	}

	public void setRoomFare(double roomFare) {
		this.roomFare = roomFare;
	}

	abstract void roomInfo(); // room information

}
