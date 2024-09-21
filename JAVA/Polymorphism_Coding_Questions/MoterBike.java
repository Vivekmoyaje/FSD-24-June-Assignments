package Polymorphism_Coding_Questions;

class Vehicle{
	
	public void move(String str) {
		
		System.out.println("The Vehicle : " +str);
	}
}

public class MoterBike extends Vehicle{
	
	@Override
	public void move(String str) {
		
		System.out.println("The Moterbike : " +str);
		
	}
	
	public static void main(String[] args) {
		
		Vehicle V = new Vehicle();
		V.move("Slow");
		
		MoterBike MB = new MoterBike();
		MB.move("Fast");
		
	}

}

//Output:

//The Vehicle : Slow
//The Moterbike : Fast
